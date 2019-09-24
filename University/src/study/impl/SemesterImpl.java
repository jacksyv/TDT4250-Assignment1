/**
 */
package study.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import study.Course;
import study.Semester;
import study.Specialisation;
import study.StudyPackage;

import study.util.Level;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link study.impl.SemesterImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link study.impl.SemesterImpl#getSpecialisation <em>Specialisation</em>}</li>
 *   <li>{@link study.impl.SemesterImpl#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Level LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecialisation() <em>Specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected Specialisation specialisation;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(Level newLevel) {
		Level oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialisation getSpecialisation() {
		if (specialisation != null && specialisation.eIsProxy()) {
			InternalEObject oldSpecialisation = (InternalEObject)specialisation;
			specialisation = (Specialisation)eResolveProxy(oldSpecialisation);
			if (specialisation != oldSpecialisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyPackage.SEMESTER__SPECIALISATION, oldSpecialisation, specialisation));
			}
		}
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation basicGetSpecialisation() {
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialisation(Specialisation newSpecialisation, NotificationChain msgs) {
		Specialisation oldSpecialisation = specialisation;
		specialisation = newSpecialisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__SPECIALISATION, oldSpecialisation, newSpecialisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialisation(Specialisation newSpecialisation) {
		if (newSpecialisation != specialisation) {
			NotificationChain msgs = null;
			if (specialisation != null)
				msgs = ((InternalEObject)specialisation).eInverseRemove(this, StudyPackage.SPECIALISATION__SEMESTERS, Specialisation.class, msgs);
			if (newSpecialisation != null)
				msgs = ((InternalEObject)newSpecialisation).eInverseAdd(this, StudyPackage.SPECIALISATION__SEMESTERS, Specialisation.class, msgs);
			msgs = basicSetSpecialisation(newSpecialisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyPackage.SEMESTER__SPECIALISATION, newSpecialisation, newSpecialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, StudyPackage.SEMESTER__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPackage.SEMESTER__SPECIALISATION:
				if (specialisation != null)
					msgs = ((InternalEObject)specialisation).eInverseRemove(this, StudyPackage.SPECIALISATION__SEMESTERS, Specialisation.class, msgs);
				return basicSetSpecialisation((Specialisation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyPackage.SEMESTER__SPECIALISATION:
				return basicSetSpecialisation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyPackage.SEMESTER__LEVEL:
				return getLevel();
			case StudyPackage.SEMESTER__SPECIALISATION:
				if (resolve) return getSpecialisation();
				return basicGetSpecialisation();
			case StudyPackage.SEMESTER__COURSES:
				return getCourses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyPackage.SEMESTER__LEVEL:
				setLevel((Level)newValue);
				return;
			case StudyPackage.SEMESTER__SPECIALISATION:
				setSpecialisation((Specialisation)newValue);
				return;
			case StudyPackage.SEMESTER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
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
			case StudyPackage.SEMESTER__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case StudyPackage.SEMESTER__SPECIALISATION:
				setSpecialisation((Specialisation)null);
				return;
			case StudyPackage.SEMESTER__COURSES:
				getCourses().clear();
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
			case StudyPackage.SEMESTER__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case StudyPackage.SEMESTER__SPECIALISATION:
				return specialisation != null;
			case StudyPackage.SEMESTER__COURSES:
				return courses != null && !courses.isEmpty();
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
		result.append(" (level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
