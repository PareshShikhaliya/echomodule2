package org.example.class5;

import java.util.ArrayList;
import java.util.List;

class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Apple extends Fruit {
    public Apple(String name) {
        super(name);
    }
}

class Orange extends Fruit {
    public Orange(String name) {
        super(name);
    }
}

public class WildcardExample10 {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple("Red Apple"));
        appleList.add(new Apple("Green Apple"));

        List<Orange> orangeList = new ArrayList<>();
        orangeList.add(new Orange("Navel Orange"));
        orangeList.add(new Orange("Valencia Orange"));

        Box<Apple> appleBox = new Box<>(appleList);
        Box<Orange> orangeBox = new Box<>(orangeList);

        // Upper-bounded wildcard: Box<? extends Fruit>
        printFruits(appleBox);
        printFruits(orangeBox);

        // Lower-bounded wildcard: Box<? super Apple>
        addApple(appleBox);
        // Error: Box<Orange> is not a super type of Apple
        // addApple(orangeBox);

        // Print the updated list after adding a new Apple
        printFruits(appleBox);
    }

    // Generic class Box to store a list of items of type T
    static class Box<T> {
        private List<T> items;

        public Box(List<T> items) {
            this.items = items;
        }

        public List<T> getItems() {
            return items;
        }
    }

    // Upper-bounded wildcard: Box<? extends Fruit>
    public static void printFruits(Box<? extends Fruit> box) {
        List<? extends Fruit> items = box.getItems();
        for (Fruit fruit : items) {
            System.out.println("Fruit: " + fruit.getName());
        }
    }

    // Lower-bounded wildcard: Box<? super Apple>
    public static void addApple(Box<? super Apple> box) {
        box.getItems().add(new Apple("New Apple"));
    }
}
/*
Certainly! Box<? extends Fruit> is an example of an upper-bounded wildcard in Java generics. Let's break down its
 meaning and implications:

Box: This is the generic class Box that holds a list of items of type T.

?: The question mark ? represents an unknown type, or a wildcard. In this context,
it stands for an unknown type that is a subtype of Fruit.

extends: The extends keyword is part of the upper-bounded wildcard syntax. It specifies that the unknown type (denoted by ?) must be a subtype of the given class or interface (in this case, Fruit).

So, Box<? extends Fruit> means a Box that can hold a list of items of any type that is a subtype of Fruit. It could be a Box of Fruit, Apple, Orange, or any other subclass of Fruit.

With this wildcard, you can safely read items from the Box but cannot add elements to it because the actual type of the Box is unknown at compile time. The compiler only knows that it contains elements that are some subtype of Fruit. This restriction is necessary to ensure type safety.
 */