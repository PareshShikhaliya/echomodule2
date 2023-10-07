package org.example.class2;

// Base class
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass Car
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand, boolean hasSideCar) {
        super(brand);
        this.hasSideCar = hasSideCar;
    }

    public void displayMotorcycleInfo() {
        displayInfo();
        System.out.println("Has Side Car: " + hasSideCar);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        Motorcycle motorcycle = new Motorcycle("Honda", true);

        car.displayCarInfo();
        motorcycle.displayMotorcycleInfo();
    }
}
