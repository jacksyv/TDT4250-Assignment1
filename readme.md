Includes EMF modeling for a studyplan at a university with semesters, courses, coursegroups, programs and specialisations. In addition added a custom datatype for semester levels (such as Spring 2019) and constraints for programs, specialisations and the studyplan located in the StudyValidator under src/study/util/studyvalidator.java And also some operations for choosing courses and specialisations, code is located under src/study.impl/StudyPlanImpl.java

The repo consists of generated code from an EMF generator project. The main model is located under model.

Acceleo M2Text transformation is also implemented, the generated html can be found under University/Model, the Acceleo transformation file can be found at org.eclipse.acceleo.module.sample/src/org/eclipse/acceleo/module/sample/main/
