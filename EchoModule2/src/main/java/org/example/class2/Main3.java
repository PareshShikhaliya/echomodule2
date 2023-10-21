package org.example.class2;
/*
you can create a subclass of an abstract class without overriding its abstract methods.
When you create a concrete subclass of an abstract class, you have two options:

Override Abstract Methods:
    In this case, you must provide concrete implementations for all the abstract methods defined in the abstract
     class. This is necessary to make the subclass concrete so that it can be instantiated.

Remain Abstract:
 If you don't want to provide concrete implementations for the abstract methods in the subclass,
  you can choose to keep the subclass abstract as well. In this scenario, the subclass will also be an abstract class and cannot be directly instantiated. It can, however, be further subclassed by other concrete or abstract classes, which will be responsible for implementing the abstract methods.
 */
abstract class Shape3 {
    public abstract void draw();
    public void commonMethod() {
        System.out.println("This is a common method in the abstract class.");
    }
}

abstract class Polygon extends Shape3 {
    @Override
    public void draw() {
        System.out.println("Drawing a polygon.");
    }
}

class Triangle3 extends Polygon
{

}

public class Main3 {
    public static void main(String[] args) {
        // You cannot instantiate an abstract class directly.
        // Shape shape = new Shape(); // Not allowed!

        // You cannot instantiate a class with unimplemented abstract methods.
        // Polygon polygon = new Polygon(); // Not allowed!

        // However, you can instantiate a concrete subclass that overrides the abstract methods.
        Triangle3 triangle = new Triangle3();
        triangle.draw();
        triangle.commonMethod();
    }
}

