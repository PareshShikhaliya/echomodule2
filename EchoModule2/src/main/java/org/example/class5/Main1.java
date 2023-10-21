package org.example.class5;
/*
Without generics, prior to Java 5, when working with collections like ArrayList, you had to deal with
 Object types, and type safety was not guaranteed. This could lead to runtime errors due to casting issues
 */
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        // Creating an ArrayList of Integers (with generics)
        ArrayList<Integer> integerList = new ArrayList<>();

        // Adding elements to the list (no casting required)
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        // Accessing elements (automatic unboxing, no casting required)
        int firstElement = integerList.get(0);
        int secondElement = integerList.get(1);
        int thirdElement = integerList.get(2);

        System.out.println("First Element: " + firstElement);
        System.out.println("Second Element: " + secondElement);
        System.out.println("Third Element: " + thirdElement);

        // Creating an ArrayList of Strings (with generics)
        ArrayList<String> stringList = new ArrayList<>();

        // Adding elements to the list (no casting required)
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // Accessing elements (no casting required)
        String firstString = stringList.get(0);
        String secondString = stringList.get(1);
        String thirdString = stringList.get(2);

        System.out.println("First String: " + firstString);
        System.out.println("Second String: " + secondString);
        System.out.println("Third String: " + thirdString);
    }
}
