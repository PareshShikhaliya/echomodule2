package org.example.class8;

class ParentClass {
    static {
        System.out.println("Static block 1 in Parent class");
    }

    static {
        System.out.println("Static block 2 in Parent class");
    }
}

class ChildClass extends ParentClass {
    static {
        System.out.println("Static block 1 in Child class");
    }

    static {
        System.out.println("Static block 2 in Child class");
    }
}

public class Main6 {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
    }
}
