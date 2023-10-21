package org.example.class3;

// Animal class (Superclass for Inheritance)
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Dog class (Subclass inheriting from Animal)
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class InheritanceExample3 {
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.makeSound(); // Output: Animal makes a sound.
        dog.makeSound();    // Output: Dog barks.
    }
}
