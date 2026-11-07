package com.interfacetype.deepcloning.quetions;

public class StudentDriver {

    public static void main(String[] args) throws CloneNotSupportedException {

        
        Student student = new Student(); // Original Student
        student.studentName = "Rohit";

        
        Univercity univercity = new Univercity(); // University object
        univercity.univercityName = "DBATU";
        univercity.location = "Lonere";

        
        Department department = new Department(); // Department object
        department.departmentName = "AI & DS";

        // Connecting objects
        univercity.department = department;
        student.univercity = univercity;

        // Deep cloning
        Student student1 = (Student) student.clone();

        // Modifying cloned object
        student1.studentName = "Rahul";
        student1.univercity.univercityName = "Pune University";
        student1.univercity.department.departmentName = "Computer Science";

        // Original object details
        System.out.println("Original Student: " + student.studentName);
        System.out.println("Original University: " + student.univercity.univercityName);
        System.out.println("Original Department: " + student.univercity.department.departmentName);

        System.out.println("----------------------------");

        // Cloned object details
        System.out.println("Cloned Student: " + student1.studentName);
        System.out.println("Cloned University: " + student1.univercity.univercityName);
        System.out.println("Cloned Department: " + student1.univercity.department.departmentName);
    }
}

