package org.example.class2;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main6
{
    public static void main(String[] args) {
        // Using List interface with ArrayList

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("ArrayList:");
        displayList(list);

        // Using List interface with LinkedList

        List<String> list2 = new LinkedList<>();
        list2.add("Car");
        list2.add("Bus");
        list2.add("Bicycle");

        System.out.println("\nLinkedList:");
        displayList(list2);
    }

    // A method to display elements of any List implementation
    private static void displayList(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}
