package org.example.class5;


import java.util.ArrayList;
import java.util.List;



class Vehicle {
    // ...
}
class RoadVehicle {
    // ...
}

class Car extends RoadVehicle {
    // ...
}

class Truck extends RoadVehicle {
    // ...
}

class Motorcycle extends RoadVehicle {
    // ...
}

class Boat extends RoadVehicle {
    // ...
}

public class TestLB {
    // Lower-bounded wildcard: void addVehicle(List<? super Vehicle> list, Vehicle vehicle)
    public static void addVehicle(List<? super RoadVehicle> list, RoadVehicle roadVehicle) {
        list.add(roadVehicle);
    }

    public static void main(String[] args) {
        List<RoadVehicle> roadVehicles = new ArrayList<>();

        Car car = new Car();
        Truck truck = new Truck();
        Motorcycle motorcycle = new Motorcycle();
        Boat boat = new Boat();

        Integer a = 10;
        Number a1 = a;

        addVehicle(roadVehicles, car); // Valid: List<Vehicle> is a superclass of List<? super Vehicle>
        addVehicle(roadVehicles, truck); // Valid: List<Vehicle> is a superclass of List<? super Vehicle>
        addVehicle(roadVehicles, motorcycle); // Valid: Motorcycle is a subclass of Vehicle

        // Compile error: Bicycle is not a subclass of Vehicle
        addVehicle(roadVehicles, boat);
    }
}


 class LowerBoundedWildcardExampleTest {
    // Lower-bounded wildcard: void addVehicle(List<? super Vehicle> list, Vehicle vehicle)
    public static void addVehicle(List<? super RoadVehicle> list, RoadVehicle roadVehicle) {
        list.add(roadVehicle);
    }

    public static void main(String[] args) {
        List<RoadVehicle> roadVehicles = new ArrayList<>();

        Car car = new Car();
        Truck truck = new Truck();
        Motorcycle motorcycle = new Motorcycle();

        addVehicle(roadVehicles, car); // Valid: List<Vehicle> is a superclass of List<? super Vehicle>
        addVehicle(roadVehicles, truck); // Valid: List<Vehicle> is a superclass of List<? super Vehicle>
        addVehicle(roadVehicles, motorcycle); // Compile error: Motorcycle is not a superclass of List<? super Vehicle>
    }
}
