package org.example.reflection;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            // Create an instance of Calculator
            Calculator calculator = new Calculator();

            // Get the 'multiply' method using Reflection
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);

            // Make the private method accessible
            multiplyMethod.setAccessible(true);

            // Invoke the method and get the result
            int result = (int) multiplyMethod.invoke(calculator, 5, 3);

            // Display the result
            System.out.println("Result of multiplication: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

