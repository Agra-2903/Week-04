package org.example.reflection;

import java.lang.reflect.Constructor;

class Student {
    private String name;

    public Student() {
        this.name = "Default Student";
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class DynamicallyCreateObjects {
    public static void main(String[] args) {
        String className = "Student";
        try {
            // Load the Student class dynamically
            Class<?> studentClass = Student.class;

            // Get the default constructor
            Constructor<?> constructor = studentClass.getDeclaredConstructor();

            // Create an instance of Student using the constructor
            Object studentInstance = constructor.newInstance();

            // Invoke the display() method to verify instance creation
            studentClass.getMethod("display").invoke(studentInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
