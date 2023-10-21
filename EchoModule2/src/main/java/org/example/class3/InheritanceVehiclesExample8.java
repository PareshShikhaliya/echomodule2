package org.example.class3;

// Vehicle class (Superclass for Inheritance)
class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Vehicle engine started.");
    }

    public void stop() {
        System.out.println("Vehicle engine stopped.");
    }

    public String getBrand() {
        return brand;
    }
}

// Car2 class (Subclass inheriting from Vehicle)
class Car2 extends Vehicle
{
    private int numDoors;

    public Car2(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }

    @Override
    public void start() {
        System.out.println("Car2 engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Car2 engine stopped.");
    }

    public void drift() {
        System.out.println("Car2 is drifting.");
    }
}

// Motorcycle class (Subclass inheriting from Vehicle)
class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle engine stopped.");
    }

    public void wheelie() {
        System.out.println("Motorcycle is doing a wheelie.");
    }
}

public class InheritanceVehiclesExample8 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Brand");
        Vehicle car = new Car2("Toyota", 4);
        Vehicle motorcycle = new Motorcycle("Honda");

        // Output: Motorcycle is doing a wheelie.
    }
}
