package org.example.aidrivenresumescreeningsystem;

public abstract class JobRole {
    private String name;
    private int age;

    public JobRole(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name, int age) {
        super(name, age);
    }
}

class DataScientist extends JobRole {
    public DataScientist(String name, int age) {
        super(name, age);
    }
}

class ProductManager extends JobRole {
    public ProductManager(String name, int age) {
        super(name, age);
    }
}
