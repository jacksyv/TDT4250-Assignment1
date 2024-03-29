/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Specialisation#getName <em>Name</em>}</li>
 *   <li>{@link study.Specialisation#getProgram <em>Program</em>}</li>
 *   <li>{@link study.Specialisation#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link study.Specialisation#getStudents <em>Students</em>}</li>
 *   <li>{@link study.Specialisation#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link study.Specialisation#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getSpecialisation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHavePreviousSpecialisation mustBePartOfProgram'"
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see study.StudyPackage#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link study.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link study.Program#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(Program)
	 * @see study.StudyPackage#getSpecialisation_Program()
	 * @see study.Program#getSpecialisations
	 * @model opposite="specialisations" required="true"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link study.Specialisation#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' attribute.
	 * @see #setRequirement(String)
	 * @see study.StudyPackage#getSpecialisation_Requirement()
	 * @model
	 * @generated
	 */
	String getRequirement();

	/**
	 * Sets the value of the '{@link study.Specialisation#getRequirement <em>Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' attribute.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(String value);

	/**
	 * Returns the value of the '<em><b>Students</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' reference.
	 * @see #setStudents(Student)
	 * @see study.StudyPackage#getSpecialisation_Students()
	 * @model required="true"
	 * @generated
	 */
	Student getStudents();

	/**
	 * Sets the value of the '{@link study.Specialisation#getStudents <em>Students</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Students</em>' reference.
	 * @see #getStudents()
	 * @generated
	 */
	void setStudents(Student value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' reference list.
	 * The list contents are of type {@link study.Semester}.
	 * It is bidirectional and its opposite is '{@link study.Semester#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' reference list.
	 * @see study.StudyPackage#getSpecialisation_Semesters()
	 * @see study.Semester#getSpecialisation
	 * @model opposite="specialisation" lower="2"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link study.Department#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see study.StudyPackage#getSpecialisation_Department()
	 * @see study.Department#getSpecialisations
	 * @model opposite="specialisations" required="true" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link study.Specialisation#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

} // Specialisation
