/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Department#getName <em>Name</em>}</li>
 *   <li>{@link study.Department#getCode <em>Code</em>}</li>
 *   <li>{@link study.Department#getCourses <em>Courses</em>}</li>
 *   <li>{@link study.Department#getPrograms <em>Programs</em>}</li>
 *   <li>{@link study.Department#getStudents <em>Students</em>}</li>
 *   <li>{@link study.Department#getSpecialisations <em>Specialisations</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see study.StudyPackage#getDepartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link study.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see study.StudyPackage#getDepartment_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link study.Department#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link study.Course}.
	 * It is bidirectional and its opposite is '{@link study.Course#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see study.StudyPackage#getDepartment_Courses()
	 * @see study.Course#getDepartment
	 * @model opposite="department" containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link study.Program}.
	 * It is bidirectional and its opposite is '{@link study.Program#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see study.StudyPackage#getDepartment_Programs()
	 * @see study.Program#getDepartment
	 * @model opposite="department" containment="true"
	 * @generated
	 */
	EList<Program> getPrograms();

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link study.Student}.
	 * It is bidirectional and its opposite is '{@link study.Student#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see study.StudyPackage#getDepartment_Students()
	 * @see study.Student#getDepartment
	 * @model opposite="department" containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Specialisations</b></em>' containment reference list.
	 * The list contents are of type {@link study.Specialisation}.
	 * It is bidirectional and its opposite is '{@link study.Specialisation#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisations</em>' containment reference list.
	 * @see study.StudyPackage#getDepartment_Specialisations()
	 * @see study.Specialisation#getDepartment
	 * @model opposite="department" containment="true" required="true"
	 * @generated
	 */
	EList<Specialisation> getSpecialisations();

} // Department
