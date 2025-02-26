package org.example.reflection.advancedlevel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Map;

public class CreateCustomObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        // Try to get a no-argument constructor
        Constructor<T> constructor;
        try {
            constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true); // Make the constructor accessible if it's private
        } catch (NoSuchMethodException e) {
            throw new NoSuchMethodException("No no-argument constructor found for class " + clazz.getName());
        }

        // Create a new instance of the class using the default constructor
        T instance = constructor.newInstance();

        // Loop through each entry in the map and set the corresponding field value
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String fieldName = entry.getKey();
            Object fieldValue = entry.getValue();

            try {
                // Get the field corresponding to the property name
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true); // Make the field accessible

                // Ensure the field's type is compatible with the value
                if (field.getType().isAssignableFrom(fieldValue.getClass())) {
                    field.set(instance, fieldValue); // Set the field value
                } else {
                    // Handle type mismatch (can be extended for conversion if needed)
                    System.out.println("Type mismatch for field: " + fieldName);
                }
            } catch (NoSuchFieldException e) {
                // Handle case where the field doesn't exist in the class
                System.out.println("No such field: " + fieldName);
            } catch (IllegalArgumentException e) {
                // Handle cases where the field type and value are incompatible
                System.out.println("Illegal argument for field: " + fieldName + ", expected: " + " but got: " + fieldValue.getClass());
            }
        }

        return instance;
    }

    // Example usage
    public static void main(String[] args) throws Exception {
        Map<String, Object> properties = Map.of(
                "name", "John",
                "age", 30
        );

        Person person = toObject(Person.class, properties);
        System.out.println(person);
    }
}

class Person {
    private String name;
    private int age;

    // No-argument constructor
    public Person() {}

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
