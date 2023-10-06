package org.example.class3;

public class Student5 {
    private String name;
    private int age;

    public Student5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeenager() {
        return age >= 13 && age <= 19;
    }
}
