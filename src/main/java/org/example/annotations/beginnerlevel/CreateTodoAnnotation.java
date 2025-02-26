package org.example.annotations.beginnerlevel;

import java.lang.reflect.Method;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the custom @Todo annotation
@Retention(RetentionPolicy.RUNTIME) // Ensure it is retained at runtime for reflection
@interface Todo {
    String task(); // Description of the task
    String assignedTo(); // Developer responsible for the task
    String priority() default "MEDIUM"; // Priority level, default is "MEDIUM"
}

class Project {

    @Todo(task = "Implement user authentication", assignedTo = "John", priority = "HIGH")
    public void userAuthentication() {
        // Method body
    }

    @Todo(task = "Design database schema", assignedTo = "Jane")
    public void designDatabase() {
        // Method body
    }

    @Todo(task = "Write unit tests for API", assignedTo = "Alice", priority = "LOW")
    public void writeTests() {
        // Method body
    }

    @Todo(task = "Create project documentation", assignedTo = "Bob")
    public void createDocumentation() {
        // Method body
    }
}

public class CreateTodoAnnotation {

    public static void main(String[] args) {
        // Get the class object for Project
        Class<?> clazz = Project.class;

        // Get all methods of the class
        Method[] methods = clazz.getDeclaredMethods();

        // Loop through all methods and check for @Todo annotation
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                // If the method is annotated with @Todo
                Todo todoAnnotation = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todoAnnotation.task());
                System.out.println("Assigned to: " + todoAnnotation.assignedTo());
                System.out.println("Priority: " + todoAnnotation.priority());
                System.out.println("Method: " + method.getName());
                System.out.println("----------");
            }
        }
    }
}
