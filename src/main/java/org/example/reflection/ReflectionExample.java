package org.example.reflection;

import java.lang.reflect.*;
import java.util.Scanner;

public class ReflectionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();
        scanner.close();

        try {
            // Load the class dynamically
            Class<?> cls = Class.forName(className);

            // Display class name
            System.out.println("Class: " + cls.getName());

            // Display constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            // Display methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

            // Display fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

