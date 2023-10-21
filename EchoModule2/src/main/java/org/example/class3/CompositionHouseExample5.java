package org.example.class3;

// Room class (Part of Composition)
class Room {
    private String name;
    private int area;

    public Room(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public void displayInfo() {
        System.out.println("Room: " + name + ", Area: " + area + " sq. ft.");
    }
}

// House class (Container with Composition)
class House {
    private Room livingRoom;
    private Room kitchen;
    private Room bedroom;

    public House() {
        livingRoom = new Room("Living Room", 250);
        kitchen = new Room("Kitchen", 150);
        bedroom = new Room("Bedroom", 200);
    }

    public void displayHouseInfo() {
        System.out.println("House Information:");
        livingRoom.displayInfo();
        kitchen.displayInfo();
        bedroom.displayInfo();
    }
}

public class CompositionHouseExample5 {
    public static void main(String[] args) {
        House house = new House();
        house.displayHouseInfo();
    }
}
