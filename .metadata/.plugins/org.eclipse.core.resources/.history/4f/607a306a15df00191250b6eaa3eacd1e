/**
 */
package study;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import study.util.Level;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.Semester#getLevel <em>Level</em>}</li>
 *   <li>{@link study.Semester#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link study.Semester#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='semesterShouldntHaveTooLittleCredit'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(Level)
	 * @see study.StudyPackage#getSemester_Level()
	 * @model dataType="study.Level"
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link study.Semester#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

	/**
	 * Returns the value of the '<em><b>Specialisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link study.Specialisation#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' reference.
	 * @see #setSpecialisation(Specialisation)
	 * @see study.StudyPackage#getSemester_Specialisation()
	 * @see study.Specialisation#getSemesters
	 * @model opposite="semesters" required="true"
	 * @generated
	 */
	Specialisation getSpecialisation();

	/**
	 * Sets the value of the '{@link study.Semester#getSpecialisation <em>Specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation</em>' reference.
	 * @see #getSpecialisation()
	 * @generated
	 */
	void setSpecialisation(Specialisation value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link study.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see study.StudyPackage#getSemester_Courses()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // Semester
