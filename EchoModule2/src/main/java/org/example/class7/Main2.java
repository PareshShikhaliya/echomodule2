package org.example.class7;

class Vehicle {}

class Car extends Vehicle {}

class Bicycle extends Vehicle {}

public class Main2 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bicycle();

        method(vehicle1);
        //method(vehicle2);
    }

    private static void method(Vehicle vehicle1) {
        if (vehicle1 instanceof Car) {

            System.out.println("Vehicle 1 is a Car");
        } else if (vehicle1 instanceof Bicycle) {
            System.out.println("Vehicle 1 is a Bicycle");
        } else {
            System.out.println("Vehicle 1 is of an unknown type");
        }
    }
}
