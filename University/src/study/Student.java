/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Student#getName <em>Name</em>}</li>
 *   <li>{@link study.Student#getDepartment <em>Department</em>}</li>
 *   <li>{@link study.Student#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link study.Student#getSpecialisations <em>Specialisations</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see study.StudyPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link study.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.Department#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see study.StudyPackage#getStudent_Department()
	 * @see study.Department#getStudents
	 * @model opposite="students" required="true" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link study.Student#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link study.StudyPlan#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' containment reference.
	 * @see #setStudyPlan(StudyPlan)
	 * @see study.StudyPackage#getStudent_StudyPlan()
	 * @see study.StudyPlan#getStudent
	 * @model opposite="student" containment="true" required="true"
	 * @generated
	 */
	StudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link study.Student#getStudyPlan <em>Study Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' containment reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(StudyPlan value);

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' reference list.
	 * The list contents are of type {@link study.Specialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' reference list.
	 * @see study.StudyPackage#getStudent_Specialisations()
	 * @model upper="2"
	 * @generated
	 */
	EList<Specialisation> getSpecialisations();

} // Student
