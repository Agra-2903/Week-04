package org.example.reflection;

import java.lang.reflect.Field;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}

public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            // Create an instance of Person
            Person person = new Person(25);

            // Get the 'age' field using Reflection
            Field ageField = Person.class.getDeclaredField("age");

            // Make the private field accessible
            ageField.setAccessible(true);

            // Retrieve the current value of 'age'
            System.out.println("Before modification, age: " + ageField.get(person));

            // Modify the 'age' field value
            ageField.set(person, 30);

            // Retrieve the updated value of 'age'
            System.out.println("After modification, age: " + ageField.get(person));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

