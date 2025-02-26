package org.example.reflection.intermediatelevel;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Load the class dynamically
            Class<?> mathClass = MathOperations.class;

            // Create an instance of MathOperations
            Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

            // Accept method name from user
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.next();

            // Accept two integer parameters
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Get the method dynamically using Reflection
            Method method = mathClass.getMethod(methodName, int.class, int.class);

            // Invoke the method with parameters
            Object result = method.invoke(mathInstance, num1, num2);

            // Display the result
            System.out.println("Result: " + result);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

