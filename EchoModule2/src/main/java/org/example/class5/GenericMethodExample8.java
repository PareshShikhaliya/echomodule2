package org.example.class5;

import java.util.List;

public class GenericMethodExample8 {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<String> strList = List.of("Hello", "World");

        printList(intList);
        printList(strList);
    }

    // Generic method to print elements in a list
    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
