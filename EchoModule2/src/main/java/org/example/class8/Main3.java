package org.example.class8;

// Parent class
class Shape {
    private String name;

    // Parameterized constructor for Shape
    public Shape(String name)
    {
        this.name = name;
        System.out.println("Shape constructor with name: " + name);
    }
}

// Child class inheriting from Shape
class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        // Calling the parameterized constructor of the parent class (Shape)
        super(name);
        this.radius = radius;
        System.out.println("Circle constructor with radius: " + radius);
    }
}

// Child class inheriting from Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        // Calling the parameterized constructor of the parent class (Shape)
        super(name);
        this.width = width;
        this.height = height;
        System.out.println("Rectangle constructor with width: " + width + " and height: " + height);
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle with parameter passing
        Circle myCircle = new Circle("Circle", 5.0);
        Rectangle myRectangle = new Rectangle("Rectangle", 3.0, 4.0);
    }
}
