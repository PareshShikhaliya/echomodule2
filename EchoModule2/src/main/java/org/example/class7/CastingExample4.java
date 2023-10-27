package org.example.class7;

class VehicleClass {
    void displayInfo() {
        System.out.println("This is a VehicleClass.");
    }
}

class CarClass extends VehicleClass
{
    void displayInfo() {
        System.out.println("This is a CarClass.");
    }

    void carSpecificMethod() {
        System.out.println("This is a car-specific method.");
    }
}

class BicycleClass extends VehicleClass {
    void displayInfo() {
        System.out.println("This is a BicycleClass.");
    }
}

public class CastingExample4 {
    public static void main(String[] args) {
        // Widening (Upcasting)
        VehicleClass vehicle = new CarClass(); // Upcasting
        vehicle.displayInfo();       // Calls CarClass's overridden method

        // Narrowing (Downcasting)
        if (vehicle instanceof CarClass car)
        {
            car.displayInfo();       // Calls CarClass's overridden method
            car.carSpecificMethod(); // Calls CarClass's specific method
        } else {
            System.out.println("The vehicle is not a CarClass.");
        }

        // Narrowing (Downcasting)
        if (vehicle instanceof CarClass)
        {
            CarClass car = (CarClass) vehicle;
            car.displayInfo();       // Calls CarClass's overridden method
            car.carSpecificMethod(); // Calls CarClass's specific method
        } else {
            System.out.println("The vehicle is not a CarClass.");
        }
    }
}
