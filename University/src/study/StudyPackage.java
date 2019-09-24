/**
 */
package study;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see study.StudyFactory
 * @model kind="package"
 * @generated
 */
public interface StudyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "study";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/University/model/study.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "study";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyPackage eINSTANCE = study.impl.StudyPackageImpl.init();

	/**
	 * The meta object id for the '{@link study.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.DepartmentImpl
	 * @see study.impl.StudyPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__CODE = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSES = 2;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PROGRAMS = 3;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__STUDENTS = 4;

	/**
	 * The feature id for the '<em><b>Specialisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__SPECIALISATIONS = 5;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link study.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.ProgramImpl
	 * @see study.impl.StudyPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CODE = 1;

	/**
	 * The feature id for the '<em><b>Num Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NUM_YEARS = 2;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__DEPARTMENT = 3;

	/**
	 * The feature id for the '<em><b>Specialisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SPECIALISATIONS = 4;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link study.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.StudentImpl
	 * @see study.impl.StudyPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__DEPARTMENT = 1;

	/**
	 * The feature id for the '<em><b>Study Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STUDY_PLAN = 2;

	/**
	 * The feature id for the '<em><b>Specialisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__SPECIALISATIONS = 3;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link study.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.CourseImpl
	 * @see study.impl.StudyPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DEPARTMENT = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link study.impl.SpecialisationImpl <em>Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.SpecialisationImpl
	 * @see study.impl.StudyPackageImpl#getSpecialisation()
	 * @generated
	 */
	int SPECIALISATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Students</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__STUDENTS = 3;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__SEMESTERS = 4;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__DEPARTMENT = 5;

	/**
	 * The number of structural features of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link study.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.SemesterImpl
	 * @see study.impl.StudyPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 5;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Specialisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SPECIALISATION = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSES = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link study.impl.StudyPlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.StudyPlanImpl
	 * @see study.impl.StudyPackageImpl#getStudyPlan()
	 * @generated
	 */
	int STUDY_PLAN = 6;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__SEMESTER = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__COURSES = 1;

	/**
	 * The feature id for the '<em><b>Student</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__STUDENT = 2;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Choose Course</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN___CHOOSE_COURSE__COURSE_STUDYPLAN = 0;

	/**
	 * The number of operations of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link study.impl.courseAllocationImpl <em>course Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.impl.courseAllocationImpl
	 * @see study.impl.StudyPackageImpl#getcourseAllocation()
	 * @generated
	 */
	int COURSE_ALLOCATION = 7;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ALLOCATION__GRADE = 0;

	/**
	 * The feature id for the '<em><b>Study Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ALLOCATION__STUDY_PLAN = 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ALLOCATION__COURSE = 2;

	/**
	 * The number of structural features of the '<em>course Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ALLOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>course Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_ALLOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link study.grades <em>grades</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.grades
	 * @see study.impl.StudyPackageImpl#getgrades()
	 * @generated
	 */
	int GRADES = 8;

	/**
	 * The meta object id for the '<em>Level</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see study.util.Level
	 * @see study.impl.StudyPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 9;


	/**
	 * Returns the meta object for class '{@link study.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see study.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link study.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see study.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the attribute '{@link study.Department#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see study.Department#getCode()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link study.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see study.Department#getCourses()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link study.Department#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see study.Department#getPrograms()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Programs();

	/**
	 * Returns the meta object for the containment reference list '{@link study.Department#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see study.Department#getStudents()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Students();

	/**
	 * Returns the meta object for the containment reference list '{@link study.Department#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialisations</em>'.
	 * @see study.Department#getSpecialisations()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Specialisations();

	/**
	 * Returns the meta object for class '{@link study.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see study.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link study.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see study.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the attribute '{@link study.Program#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see study.Program#getCode()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Code();

	/**
	 * Returns the meta object for the attribute '{@link study.Program#getNumYears <em>Num Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Years</em>'.
	 * @see study.Program#getNumYears()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_NumYears();

	/**
	 * Returns the meta object for the container reference '{@link study.Program#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see study.Program#getDepartment()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Department();

	/**
	 * Returns the meta object for the reference list '{@link study.Program#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialisations</em>'.
	 * @see study.Program#getSpecialisations()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Specialisations();

	/**
	 * Returns the meta object for class '{@link study.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see study.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link study.Student#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see study.Student#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the container reference '{@link study.Student#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see study.Student#getDepartment()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Department();

	/**
	 * Returns the meta object for the containment reference '{@link study.Student#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Study Plan</em>'.
	 * @see study.Student#getStudyPlan()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_StudyPlan();

	/**
	 * Returns the meta object for the reference list '{@link study.Student#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialisations</em>'.
	 * @see study.Student#getSpecialisations()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Specialisations();

	/**
	 * Returns the meta object for class '{@link study.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see study.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link study.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see study.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link study.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see study.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link study.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see study.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link study.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see study.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the container reference '{@link study.Course#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see study.Course#getDepartment()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Department();

	/**
	 * Returns the meta object for class '{@link study.Specialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation</em>'.
	 * @see study.Specialisation
	 * @generated
	 */
	EClass getSpecialisation();

	/**
	 * Returns the meta object for the attribute '{@link study.Specialisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see study.Specialisation#getName()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Name();

	/**
	 * Returns the meta object for the reference '{@link study.Specialisation#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see study.Specialisation#getProgram()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Program();

	/**
	 * Returns the meta object for the attribute '{@link study.Specialisation#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement</em>'.
	 * @see study.Specialisation#getRequirement()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Requirement();

	/**
	 * Returns the meta object for the reference '{@link study.Specialisation#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Students</em>'.
	 * @see study.Specialisation#getStudents()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Students();

	/**
	 * Returns the meta object for the reference list '{@link study.Specialisation#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semesters</em>'.
	 * @see study.Specialisation#getSemesters()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Semesters();

	/**
	 * Returns the meta object for the container reference '{@link study.Specialisation#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see study.Specialisation#getDepartment()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Department();

	/**
	 * Returns the meta object for class '{@link study.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see study.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link study.Semester#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see study.Semester#getLevel()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Level();

	/**
	 * Returns the meta object for the reference '{@link study.Semester#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialisation</em>'.
	 * @see study.Semester#getSpecialisation()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Specialisation();

	/**
	 * Returns the meta object for the reference list '{@link study.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see study.Semester#getCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Courses();

	/**
	 * Returns the meta object for class '{@link study.StudyPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see study.StudyPlan
	 * @generated
	 */
	EClass getStudyPlan();

	/**
	 * Returns the meta object for the containment reference '{@link study.StudyPlan#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semester</em>'.
	 * @see study.StudyPlan#getSemester()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Semester();

	/**
	 * Returns the meta object for the containment reference list '{@link study.StudyPlan#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see study.StudyPlan#getCourses()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Courses();

	/**
	 * Returns the meta object for the container reference '{@link study.StudyPlan#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Student</em>'.
	 * @see study.StudyPlan#getStudent()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Student();

	/**
	 * Returns the meta object for the '{@link study.StudyPlan#chooseCourse(study.Course, study.StudyPlan) <em>Choose Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Choose Course</em>' operation.
	 * @see study.StudyPlan#chooseCourse(study.Course, study.StudyPlan)
	 * @generated
	 */
	EOperation getStudyPlan__ChooseCourse__Course_StudyPlan();

	/**
	 * Returns the meta object for class '{@link study.courseAllocation <em>course Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>course Allocation</em>'.
	 * @see study.courseAllocation
	 * @generated
	 */
	EClass getcourseAllocation();

	/**
	 * Returns the meta object for the attribute '{@link study.courseAllocation#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see study.courseAllocation#getGrade()
	 * @see #getcourseAllocation()
	 * @generated
	 */
	EAttribute getcourseAllocation_Grade();

	/**
	 * Returns the meta object for the reference '{@link study.courseAllocation#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Study Plan</em>'.
	 * @see study.courseAllocation#getStudyPlan()
	 * @see #getcourseAllocation()
	 * @generated
	 */
	EReference getcourseAllocation_StudyPlan();

	/**
	 * Returns the meta object for the reference '{@link study.courseAllocation#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see study.courseAllocation#getCourse()
	 * @see #getcourseAllocation()
	 * @generated
	 */
	EReference getcourseAllocation_Course();

	/**
	 * Returns the meta object for enum '{@link study.grades <em>grades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>grades</em>'.
	 * @see study.grades
	 * @generated
	 */
	EEnum getgrades();

	/**
	 * Returns the meta object for data type '{@link study.util.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Level</em>'.
	 * @see study.util.Level
	 * @model instanceClass="study.util.Level"
	 * @generated
	 */
	EDataType getLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyFactory getStudyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link study.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.DepartmentImpl
		 * @see study.impl.StudyPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__CODE = eINSTANCE.getDepartment_Code();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSES = eINSTANCE.getDepartment_Courses();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__PROGRAMS = eINSTANCE.getDepartment_Programs();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__STUDENTS = eINSTANCE.getDepartment_Students();

		/**
		 * The meta object literal for the '<em><b>Specialisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__SPECIALISATIONS = eINSTANCE.getDepartment_Specialisations();

		/**
		 * The meta object literal for the '{@link study.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.ProgramImpl
		 * @see study.impl.StudyPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__CODE = eINSTANCE.getProgram_Code();

		/**
		 * The meta object literal for the '<em><b>Num Years</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NUM_YEARS = eINSTANCE.getProgram_NumYears();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__DEPARTMENT = eINSTANCE.getProgram_Department();

		/**
		 * The meta object literal for the '<em><b>Specialisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SPECIALISATIONS = eINSTANCE.getProgram_Specialisations();

		/**
		 * The meta object literal for the '{@link study.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.StudentImpl
		 * @see study.impl.StudyPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__DEPARTMENT = eINSTANCE.getStudent_Department();

		/**
		 * The meta object literal for the '<em><b>Study Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__STUDY_PLAN = eINSTANCE.getStudent_StudyPlan();

		/**
		 * The meta object literal for the '<em><b>Specialisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__SPECIALISATIONS = eINSTANCE.getStudent_Specialisations();

		/**
		 * The meta object literal for the '{@link study.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.CourseImpl
		 * @see study.impl.StudyPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__DEPARTMENT = eINSTANCE.getCourse_Department();

		/**
		 * The meta object literal for the '{@link study.impl.SpecialisationImpl <em>Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.SpecialisationImpl
		 * @see study.impl.StudyPackageImpl#getSpecialisation()
		 * @generated
		 */
		EClass SPECIALISATION = eINSTANCE.getSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__NAME = eINSTANCE.getSpecialisation_Name();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__PROGRAM = eINSTANCE.getSpecialisation_Program();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__REQUIREMENT = eINSTANCE.getSpecialisation_Requirement();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__STUDENTS = eINSTANCE.getSpecialisation_Students();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__SEMESTERS = eINSTANCE.getSpecialisation_Semesters();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__DEPARTMENT = eINSTANCE.getSpecialisation_Department();

		/**
		 * The meta object literal for the '{@link study.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.SemesterImpl
		 * @see study.impl.StudyPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__LEVEL = eINSTANCE.getSemester_Level();

		/**
		 * The meta object literal for the '<em><b>Specialisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SPECIALISATION = eINSTANCE.getSemester_Specialisation();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSES = eINSTANCE.getSemester_Courses();

		/**
		 * The meta object literal for the '{@link study.impl.StudyPlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.StudyPlanImpl
		 * @see study.impl.StudyPackageImpl#getStudyPlan()
		 * @generated
		 */
		EClass STUDY_PLAN = eINSTANCE.getStudyPlan();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__SEMESTER = eINSTANCE.getStudyPlan_Semester();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__COURSES = eINSTANCE.getStudyPlan_Courses();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__STUDENT = eINSTANCE.getStudyPlan_Student();

		/**
		 * The meta object literal for the '<em><b>Choose Course</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDY_PLAN___CHOOSE_COURSE__COURSE_STUDYPLAN = eINSTANCE.getStudyPlan__ChooseCourse__Course_StudyPlan();

		/**
		 * The meta object literal for the '{@link study.impl.courseAllocationImpl <em>course Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.impl.courseAllocationImpl
		 * @see study.impl.StudyPackageImpl#getcourseAllocation()
		 * @generated
		 */
		EClass COURSE_ALLOCATION = eINSTANCE.getcourseAllocation();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_ALLOCATION__GRADE = eINSTANCE.getcourseAllocation_Grade();

		/**
		 * The meta object literal for the '<em><b>Study Plan</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_ALLOCATION__STUDY_PLAN = eINSTANCE.getcourseAllocation_StudyPlan();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_ALLOCATION__COURSE = eINSTANCE.getcourseAllocation_Course();

		/**
		 * The meta object literal for the '{@link study.grades <em>grades</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.grades
		 * @see study.impl.StudyPackageImpl#getgrades()
		 * @generated
		 */
		EEnum GRADES = eINSTANCE.getgrades();

		/**
		 * The meta object literal for the '<em>Level</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see study.util.Level
		 * @see study.impl.StudyPackageImpl#getLevel()
		 * @generated
		 */
		EDataType LEVEL = eINSTANCE.getLevel();

	}

} //StudyPackage
