package org.example.coursemanagesystem;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> list = new ArrayList<>();

    public void addCourse(T course) {
        list.add(course);
    }

    public List<? extends CourseType> getCourses() {
        return list;
    }
}
