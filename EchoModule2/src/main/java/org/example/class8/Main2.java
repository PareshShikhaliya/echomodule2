package org.example.class8;

// Grandparent class
class Animal {
    public Animal() {
        System.out.println("Animal constructor");
    }
}

// Parent class inheriting from Animal
class Mammal extends Animal {
    public Mammal() {
        // Calling the constructor of the parent class (Animal) first
        System.out.println("Mammal constructor");
    }
}

// Child class inheriting from Mammal
class Dog extends Mammal {
    public Dog() {
        // Calling the constructor of the parent class (Mammal) first
        System.out.println("Dog constructor");
    }
}

// Child class inheriting from Mammal
class Cat extends Mammal {
    public Cat() {
        // Calling the constructor of the parent class (Mammal) first
        System.out.println("Cat constructor");
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Creating instances of Dog and Cat
        // This will trigger the constructor calls of Animal -> Mammal -> Dog and Animal -> Mammal -> Cat
        Dog myDog = new Dog();
        Cat myCat = new Cat();
    }
}
