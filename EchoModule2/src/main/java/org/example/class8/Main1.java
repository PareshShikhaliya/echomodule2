package org.example.class8;

// Parent class Vehicle
class Vehicle {
    public Vehicle()
    {
        System.out.println("Vehicle constructor");
    }
}

// Child class Car extending Vehicle
class Car extends Vehicle {
    public Car()
    {
        // When a Car object is created, its constructor is called.
        // But before that, the constructor of the parent class (Vehicle) is called first.
        // This is due to constructor chaining, where the child class constructor implicitly calls
        // the constructor of its parent class before executing its own constructor code.
        System.out.println("Car constructor");
    }
}

// Main class
public class Main1 {
    public static void main(String[] args) {
        // Creating an instance of the Car class
        // This will trigger the constructor of Car, and due to inheritance, the constructor
        // of Vehicle is called first.
        Car myCar = new Car();
    }
}
