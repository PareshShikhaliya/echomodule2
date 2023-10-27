package org.example.class7;

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class Main1 {
    public static void main(String[] args)
    {
        Animal animal = new Cat();

        findAnimal(animal);
    }

    private static void findAnimal(Animal animal)
    {
        if (animal instanceof Dog) {
            System.out.println("The animal is a Dog");
        } else if (animal instanceof Cat) {
            System.out.println("The animal is a Cat");
        } else {
            System.out.println("The animal is of an unknown type");
        }
    }
}
