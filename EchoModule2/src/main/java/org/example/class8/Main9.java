package org.example.class8;

class Parent {
    static int staticParentVar = 10;   // Static variable with initializer
    int instanceParentVar;             // Instance variable

    static {
        System.out.println("Static block in Parent class");
    }

    {
        System.out.println("Instance initialization block in Parent class");
        instanceParentVar = 5;
    }

    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    static int staticChildVar = 20;    // Static variable with initializer
    int instanceChildVar;              // Instance variable

    static {
        System.out.println("Static block in Child class");
    }

    {
        System.out.println("Instance initialization block in Child class");
        instanceChildVar = 15;
    }

    Child() {
        System.out.println("Child constructor");
    }
}

public class Main9 {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("==================================");
        Child child2 = new Child();
    }
}
