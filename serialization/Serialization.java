package org.example.serialization;

import java.io.*;

class Employee implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class Serialization {

    public static void addData(Employee employee) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\College\\Capgemini\\Week04\\Day03\\src\\main\\java\\org\\example\\serialization\\employee.ser"))) {
            oos.writeObject(employee);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void displayData(Employee employee) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\College\\Capgemini\\Week04\\Day03\\src\\main\\java\\org\\example\\serialization\\employee.ser"))) {
            Employee deserializedEmployee = (Employee) ois.readObject();
            System.out.printf("%-8d%-15s%-10s%-8.2f%n", deserializedEmployee.getId(), deserializedEmployee.getName(), deserializedEmployee.getDepartment(), deserializedEmployee.getSalary());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(6516, "Kushagra", "IT", 651358.65);
        Employee emp2 = new Employee(5613, "Shreya", "HR", 656513.46);

        addData(emp1);
        addData(emp2);

        displayData(emp1);
        displayData(emp2);
    }
}
