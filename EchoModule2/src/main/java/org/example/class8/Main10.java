package org.example.class8;

class ParentSample
{
    static {
        System.out.println("Static block of ParentSample class");
    }

    {
        System.out.println("Instance block of ParentSample class");
    }

    ParentSample() {
        System.out.println("ParentSample constructor");
    }

    ParentSample(int x) {
        System.out.println("ParentSample overloaded constructor with parameter: " + x);
    }
}

class ChildSample extends ParentSample {
    static {
        System.out.println("Static block of ChildSample class");
    }

    private int childValue;

    {
        System.out.println("Instance block of ChildSample class");
        childValue = 5; // Initializing instance variable in instance block
    }

    ChildSample() {
        super(); // Calling parent default constructor using super
        System.out.println("ChildSample constructor");
        childValue = 10; // Modifying instance variable
    }

    ChildSample(int y) {
        super(y); // Calling parent overloaded constructor using super
        System.out.println("ChildSample overloaded constructor with parameter: " + y);
        childValue = y; // Modifying instance variable
    }

    public int getChildValue() {
        return childValue;
    }
}

public class Main10 {
    public static void main(String[] args) {
        System.out.println("Creating ChildSample object:");
        ChildSample child1 = new ChildSample();
        System.out.println("ChildSample value: " + child1.getChildValue());

        System.out.println("\nCreating ParentSample object:");
        ParentSample parent1 = new ParentSample();

        System.out.println("\nCreating ChildSample object with parameter:");
        ChildSample child2 = new ChildSample(42);
        System.out.println("ChildSample value: " + child2.getChildValue());
    }
}

