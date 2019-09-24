/**
 */
package study.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import study.Course;
import study.StudyPackage;
import study.StudyPlan;
import study.courseAllocation;
import study.grades;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>course Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link study.impl.courseAllocationImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link study.impl.courseAllocationImpl#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link study.impl.courseAllocationImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class courseAllocationImpl extends MinimalEObjectImpl.Container implements courseAllocation {
	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final grades GRADE_EDEFAULT = grades.A;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected grades grade = GRADE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudyPlan() <em>Study Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPlan()
	 * @generated
	 * @ordered
	 */
	protected StudyPlan studyPlan;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected courseAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.COURSE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public grades getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrade(grades newGrade) {
		grades oldGrade = grade;
		grade = newGrade == null ? GRADE_EDEFAULT : newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.COURSE_ALLOCATION__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyPlan getStudyPlan() {
		if (studyPlan != null && studyPlan.eIsProxy()) {
			InternalEObject oldStudyPlan = (InternalEObject)studyPlan;
			studyPlan = (StudyPlan)eResolveProxy(oldStudyPlan);
			if (studyPlan != oldStudyPlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyPackage.COURSE_ALLOCATION__STUDY_PLAN, oldStudyPlan, studyPlan));
			}
		}
		return studyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlan basicGetStudyPlan() {
		return studyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyPlan(StudyPlan newStudyPlan) {
		StudyPlan oldStudyPlan = studyPlan;
		studyPlan = newStudyPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.COURSE_ALLOCATION__STUDY_PLAN, oldStudyPlan, studyPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject)course;
			course = (Course)eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyPackage.COURSE_ALLOCATION__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.COURSE_ALLOCATION__COURSE, oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyPackage.COURSE_ALLOCATION__GRADE:
				return getGrade();
			case StudyPackage.COURSE_ALLOCATION__STUDY_PLAN:
				if (resolve) return getStudyPlan();
				return basicGetStudyPlan();
			case StudyPackage.COURSE_ALLOCATION__COURSE:
				if (resolve) return getCourse();
				return basicGetCourse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyPackage.COURSE_ALLOCATION__GRADE:
				setGrade((grades)newValue);
				return;
			case StudyPackage.COURSE_ALLOCATION__STUDY_PLAN:
				setStudyPlan((StudyPlan)newValue);
				return;
			case StudyPackage.COURSE_ALLOCATION__COURSE:
				setCourse((Course)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyPackage.COURSE_ALLOCATION__GRADE:
				setGrade(GRADE_EDEFAULT);
				return;
			case StudyPackage.COURSE_ALLOCATION__STUDY_PLAN:
				setStudyPlan((StudyPlan)null);
				return;
			case StudyPackage.COURSE_ALLOCATION__COURSE:
				setCourse((Course)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyPackage.COURSE_ALLOCATION__GRADE:
				return grade != GRADE_EDEFAULT;
			case StudyPackage.COURSE_ALLOCATION__STUDY_PLAN:
				return studyPlan != null;
			case StudyPackage.COURSE_ALLOCATION__COURSE:
				return course != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (grade: ");
		result.append(grade);
		result.append(')');
		return result.toString();
	}

} //courseAllocationImpl
