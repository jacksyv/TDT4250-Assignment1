/**
 */
package study.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import study.StudyFactory;
import study.StudyPlan;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link study.StudyPlan#chooseCourse(study.Course, study.StudyPlan) <em>Choose Course</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StudyPlanTest extends TestCase {

	/**
	 * The fixture for this Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlan fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudyPlanTest.class);
	}

	/**
	 * Constructs a new Plan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlanTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StudyPlan fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlan getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyFactory.eINSTANCE.createStudyPlan());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link study.StudyPlan#chooseCourse(study.Course, study.StudyPlan) <em>Choose Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.StudyPlan#chooseCourse(study.Course, study.StudyPlan)
	 * @generated
	 */
	public void testChooseCourse__Course_StudyPlan() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //StudyPlanTest
