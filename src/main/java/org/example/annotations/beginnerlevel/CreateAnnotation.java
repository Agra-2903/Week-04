package org.example.annotations.beginnerlevel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME) // This ensures the annotation is available at runtime for reflection
@interface ImportantMethod {
    String level() default "HIGH"; // Optional parameter with a default value of "HIGH"
}

class MyClass {

    @ImportantMethod(level = "LOW")
    public void lowPriorityMethod() {
        System.out.println("Low priority method executed.");
    }

    @ImportantMethod(level = "HIGH")
    public void highPriorityMethod() {
        System.out.println("High priority method executed.");
    }

    @ImportantMethod
    public void defaultPriorityMethod() {
        System.out.println("Default priority method executed.");
    }
}

public class CreateAnnotation {
    public static void main(String[] args) {
        // Get the class object for MyClass
        Class<?> clazz = MyClass.class;

        // Get all methods of the class
        Method[] methods = clazz.getDeclaredMethods();

        // Loop through all methods and check for @ImportantMethod annotation
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                // If the method is annotated with @ImportantMethod
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Priority Level: " + annotation.level());
            }
        }
    }
}
