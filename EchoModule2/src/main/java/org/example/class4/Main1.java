package org.example.class4;

public class Main1 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Triangle area: " + triangle.calculateArea());

        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
