package org.example.reflection.intermediatelevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME) // Make it available at runtime
@Target(ElementType.TYPE)           // Applicable to classes only
@interface Author {
    String name(); // Annotation element (parameter)
}

@Author(name = "John Doe")
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book Title: " + title);
    }
}

public class RetrieveAnnotationsAtRuntime {
    public static void main(String[] args) {
        try {
            // Load the class dynamically
            Class<?> bookClass = Book.class;

            // Check if @Author annotation is present
            if (bookClass.isAnnotationPresent(Author.class)) {
                // Retrieve the annotation
                Author authorAnnotation = bookClass.getAnnotation(Author.class);

                // Display the annotation value
                System.out.println("Author of the Book: " + authorAnnotation.name());
            } else {
                System.out.println("No @Author annotation found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
