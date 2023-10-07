package org.example.class1;

// Inheritance example with vehicles

// Step 1: Create an abstract class 'Vehicle'
abstract class Vehicle {
    private int numWheels;
    private int maxSpeed;

    public Vehicle(int numWheels, int maxSpeed) {
        this.numWheels = numWheels;
        this.maxSpeed = maxSpeed;
    }

    // Common method for all vehicles
    public void displayInfo()
    {
        System.out.println("Number of wheels: " + numWheels);
        System.out.println("Maximum speed: " + maxSpeed + " km/h");
    }

    // Abstract method for a unique behavior of each vehicle
    public abstract void startEngine();
}

// Step 2: Create subclasses 'Car' and 'Bicycle' that inherit from 'Vehicle'
class Car extends Vehicle {
    private int numDoors;

    public Car(int numWheels, int maxSpeed, int numDoors) {
        super(numWheels, maxSpeed);
        this.numDoors = numDoors;
    }

    @Override
    public void startEngine()
    {
        System.out.println("Car engine started.");
    }

    // Additional method specific to cars
    public void honk() {
        System.out.println("Honk! Honk!");
    }
}

class Bicycle extends Vehicle {
    private int numGears;

    public Bicycle(int numWheels, int maxSpeed, int numGears)
    {
        super(numWheels, maxSpeed);
        this.numGears = numGears;
    }

    @Override
    public void startEngine() {
        System.out.println("No engine to start. Pedal power!");
    }

    // Additional method specific to bicycles
    public void ringBell() {
        System.out.println("Ring! Ring!");
    }
}

// Main class to create and interact with vehicles
public class Inheritance {
    public static void main(String[] args) {
        // Create a car and a bicycle
        Vehicle sedanCar = new Car(4, 180, 4);
        Vehicle mountainBike = new Bicycle(2, 30, 6);

        // Display info and start the engine of each vehicle
        sedanCar.displayInfo();
        sedanCar.startEngine();
        //sedanCar.honk();
        ((Car) sedanCar).honk(); // Casting to call the 'honk' method specific to cars

        mountainBike.displayInfo();
        mountainBike.startEngine();
        ((Bicycle) mountainBike).ringBell(); // Casting to call the 'ringBell' method specific to bicycles
    }
}
