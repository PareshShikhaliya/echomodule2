package org.example.class3;


// Engine class (Part of Composition)
class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

// Car class (Container with Composition)
class Car {
    private Engine engine;

    public Car()
    {
        engine = new Engine();
    }

    public void startCar()
    {
        engine.start();
        System.out.println("Car started.");
    }
}

public class CompositionExample1 {
    public static void main(String[] args)
    {

        Car car = new Car();
        car.startCar();
    }
}
