package org.example.coursemanagesystem;

public abstract class CourseType {
    private String courseName;
    private String professor;

    public CourseType(String name, String professor){
        this.courseName = name;
        this.professor = professor;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getProfessor() {
        return professor;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String name, String professor) {
        super(name, professor);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name, String professor) {
        super(name, professor);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name, String professor) {
        super(name, professor);
    }
}