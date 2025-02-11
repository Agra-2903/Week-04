package org.example.aidrivenresumescreeningsystem;

public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        Resume<DataScientist> dsResumes = new Resume<>();
        Resume<ProductManager> pmResumes = new Resume<>();

        seResumes.addResume(new SoftwareEngineer("Alice Johnson", 23));
        seResumes.addResume(new SoftwareEngineer("Bob Smith", 21));

        dsResumes.addResume(new DataScientist("Charlie Brown", 30));
        dsResumes.addResume(new DataScientist("David Lee", 32));

        pmResumes.addResume(new ProductManager("Emma Watson", 28));
        pmResumes.addResume(new ProductManager("Frank Martin", 33));

        System.out.println("Software Engineer Resumes:");
        for(JobRole se: seResumes.getResumes()){
            System.out.println("Name: " + se.getName());
            System.out.println("Age: " + se.getAge());
        }

        System.out.println("\nData Scientist Resumes:");
        for(JobRole ds: dsResumes.getResumes()){
            System.out.println("Name: " + ds.getName());
            System.out.println("Age: " + ds.getAge());
        }

        System.out.println("\nProduct Manager Resumes:");
        for(JobRole pm: pmResumes.getResumes()){
            System.out.println("Name: " + pm.getName());
            System.out.println("Age: " + pm.getAge());
        }
    }
}
