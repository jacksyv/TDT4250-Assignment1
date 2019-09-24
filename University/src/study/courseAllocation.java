/**
 */
package study;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>course Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link study.courseAllocation#getGrade <em>Grade</em>}</li>
 *   <li>{@link study.courseAllocation#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link study.courseAllocation#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see study.StudyPackage#getcourseAllocation()
 * @model
 * @generated
 */
public interface courseAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * The literals are from the enumeration {@link study.grades}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see study.grades
	 * @see #setGrade(grades)
	 * @see study.StudyPackage#getcourseAllocation_Grade()
	 * @model
	 * @generated
	 */
	grades getGrade();

	/**
	 * Sets the value of the '{@link study.courseAllocation#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see study.grades
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(grades value);

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' reference.
	 * @see #setStudyPlan(StudyPlan)
	 * @see study.StudyPackage#getcourseAllocation_StudyPlan()
	 * @model
	 * @generated
	 */
	StudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link study.courseAllocation#getStudyPlan <em>Study Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(StudyPlan value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see study.StudyPackage#getcourseAllocation_Course()
	 * @model
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link study.courseAllocation#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // courseAllocation
