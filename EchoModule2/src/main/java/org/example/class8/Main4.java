package org.example.class8;

class A
{
    static
    {
        System.out.println("Class A is loaded");
    }
}

class B extends A {
    static {
        System.out.println("Class B is loaded");
    }
}

public class Main4 {
    public static void main(String[] args)
    {
        B obj = new B();
    }
}
