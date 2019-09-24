/**
 */
package study.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import study.StudyFactory;
import study.courseAllocation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>course Allocation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class courseAllocationTest extends TestCase {

	/**
	 * The fixture for this course Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected courseAllocation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(courseAllocationTest.class);
	}

	/**
	 * Constructs a new course Allocation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public courseAllocationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this course Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(courseAllocation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this course Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected courseAllocation getFixture() {
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
		setFixture(StudyFactory.eINSTANCE.createcourseAllocation());
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

} //courseAllocationTest
