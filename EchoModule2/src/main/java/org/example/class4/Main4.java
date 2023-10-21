package org.example.class4;

// Implement the interface in a class
class Car implements Vehicle
{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}




// Main class to test the implementation
public class Main4 {
    public static void main(String[] args) {
        Vehicle car = new Car();

        car.start();
        car.honk(); // Using the default method
        car.stop();
    }
}
