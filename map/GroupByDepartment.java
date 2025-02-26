package org.example.Map;

import java.util.*;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> groupedByDept = new HashMap<>();

        for (Employee emp : employees) {
            groupedByDept.putIfAbsent(emp.department, new ArrayList<>());

            groupedByDept.get(emp.department).add(emp);
        }

        for(Map.Entry<String, List<Employee>> entry: groupedByDept.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (Employee emp : entry.getValue()) {
                System.out.print(emp.name + " ");
            }
            System.out.println();
        }
    }
}

