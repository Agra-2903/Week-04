package org.example.coursemanagesystem;

public class CourseManagementSystem {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Adding courses to different categories
        examCourses.addCourse(new ExamCourse("Mathematics", "Dr. Smith"));
        examCourses.addCourse(new ExamCourse("Physics", "Dr. Johnson"));

        assignmentCourses.addCourse(new AssignmentCourse("Software Engineering", "Prof. Lee"));
        assignmentCourses.addCourse(new AssignmentCourse("Database Systems", "Dr. Brown"));

        researchCourses.addCourse(new ResearchCourse("Artificial Intelligence", "Dr. White"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing", "Dr. Black"));

        // Displaying all courses
        System.out.println("Exam-Based Courses:");
        for(CourseType e: examCourses.getCourses()){
            System.out.println("Course: " + e.getCourseName());
            System.out.println("Professor: " + e.getProfessor());
        }

        System.out.println("\nAssignment-Based Courses:");
        for(CourseType a: assignmentCourses.getCourses()){
            System.out.println("Course: " + a.getCourseName());
            System.out.println("Professor: " + a.getProfessor());
        }

        System.out.println("\nResearch-Based Courses:");
        for(CourseType r: researchCourses.getCourses()){
            System.out.println("Course: " + r.getCourseName());
            System.out.println("Professor: " + r.getProfessor());
        }
    }
}
