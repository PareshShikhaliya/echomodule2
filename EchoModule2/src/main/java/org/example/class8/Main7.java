package org.example.class8;

class Example {
    int instanceVariable = initializeInstanceVariable(); // Instance variable

    static int staticVariable = initializeStaticVariable(); // Static variable

    // Instance variable initializer
    int initializeInstanceVariable() {
        System.out.println("Initializing instanceVariable");
        return 5;
    }

    // Static variable initializer
    static int initializeStaticVariable()
    {
        System.out.println("Initializing staticVariable");
        return 10;
    }

    // Constructor
    Example() {
        System.out.println("Constructor");
    }
}

public class Main7 {
    public static void main(String[] args) {
        Example example = new Example();
    }
}
