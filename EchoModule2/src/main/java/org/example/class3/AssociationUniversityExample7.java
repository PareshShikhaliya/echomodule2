package org.example.class3;

import java.util.ArrayList;
import java.util.List;

// Student class
class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

// University class
class University {
    private String name;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}

public class AssociationUniversityExample7 {
    public static void main(String[] args) {
        University university = new University("ABC University");

        Student student1 = new Student("John Doe", 101);
        Student student2 = new Student("Jane Smith", 102);
        Student student3 = new Student("Alice Johnson", 103);

        university.enrollStudent(student1);
        university.enrollStudent(student2);
        university.enrollStudent(student3);

        System.out.println(university.getName() + " Students:");
        List<Student> students = university.getStudents();
        for (Student student : students) {
            System.out.println("Roll Number: " + student.getRollNumber() + ", Name: " + student.getName());
        }
    }
}
