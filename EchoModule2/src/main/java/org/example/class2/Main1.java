package org.example.class2;
/*
Abstract Class: An abstract class is a class that cannot be instantiated on its own and is typically used as
a base or blueprint for other classes.
It may contain both abstract (without implementation) and concrete (with implementation) methods.
An abstract class is declared using the abstract keyword.
Subclasses that extend an abstract class must provide concrete implementations for all its abstract methods.

Use of Abstract Class:

To define a common interface: Abstract classes allow you to define a common set of methods that must be implemented by its subclasses, ensuring a consistent interface for related classes.
To provide default behavior: Abstract classes can provide default implementations for some methods,
 allowing subclasses to inherit and use that behavior while still requiring them to implement specific methods.
To enforce method implementation: Abstract classes with abstract methods force subclasses to implement those methods, ensuring that certain behaviors are present in all subclasses.
Abstract Method: An abstract method is a method declared in an abstract class that does not have a method body (no implementation) and is marked with the abstract keyword. Subclasses that extend the abstract class must provide concrete implementations for all its abstract methods.

Use of Abstract Method:

To define a contract: Abstract methods define a contract that subclasses must adhere to.
 Each subclass must provide its own implementation of the abstract method,
  tailoring it to its specific behavior.
 */
abstract class Shape {
    protected String name;

    public Shape(String name)
    {
        this.name = name;
    }

    // Abstract method: no implementation provided
    public abstract double area();

    // Concrete method: complete implementation provided
    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + area());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Example demonstrating the use of abstract class and concrete subclasses

        // Creating instances of different shapes
        Shape circle = new Circle("Circle", 5.0);
        Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        Shape triangle = new Triangle("Triangle", 3.0, 4.0);

        // Calling displayInfo() method of abstract class
        System.out.println("--- Displaying Shape Information ---");
        circle.displayInfo();
        rectangle.displayInfo();
        triangle.displayInfo();

        // Example of runtime polymorphism using abstract class reference


        System.out.println("\n--- Runtime Polymorphism ---");
        Shape[] shapes = { circle, rectangle, triangle };
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.name);
            System.out.println("Area: " + shape.area());
            System.out.println();
        }
    }
}
