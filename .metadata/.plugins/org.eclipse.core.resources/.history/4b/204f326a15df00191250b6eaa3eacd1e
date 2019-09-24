/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.StudyPlan#getSemester <em>Semester</em>}</li>
 *   <li>{@link study.StudyPlan#getCourses <em>Courses</em>}</li>
 *   <li>{@link study.StudyPlan#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference.
	 * @see #setSemester(Semester)
	 * @see study.StudyPackage#getStudyPlan_Semester()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link study.StudyPlan#getSemester <em>Semester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' containment reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link study.courseAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see study.StudyPackage#getStudyPlan_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<courseAllocation> getCourses();

	/**
	 * Returns the value of the '<em><b>Student</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.Student#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' container reference.
	 * @see #setStudent(Student)
	 * @see study.StudyPackage#getStudyPlan_Student()
	 * @see study.Student#getStudyPlan
	 * @model opposite="studyPlan" required="true" transient="false"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link study.StudyPlan#getStudent <em>Student</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' container reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void chooseCourse(Course course, StudyPlan studyplan);

} // StudyPlan
