package org.example.class5;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        // Creating a raw ArrayList (without generics)
        ArrayList numberList = new ArrayList();

        // Adding elements to the list (implicitly casting to Object)
        numberList.add(10);
        numberList.add("Hello"); // Adding a string to an integer list (unsafe)

        // Retrieving elements and casting them back to their original type (unsafe)
        int firstElement = (int) numberList.get(0);
        int secondElement = (int) numberList.get(1); // Runtime ClassCastException

        System.out.println("First Element: " + firstElement);
        System.out.println("Second Element: " + secondElement);
    }
}
