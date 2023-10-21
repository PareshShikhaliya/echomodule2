package org.example.class5;

import java.util.List;

public class WildcardExample9 {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<String> strList = List.of("Hello", "World");
        List<Double> doubleList = List.of(3.14, 2.71);

        System.out.println("Integer List:");
        printList(intList);

        System.out.println("\nString List:");
        printList(strList);

        System.out.println("\nDouble List:");
        printList(doubleList);
    }

    // Wildcard method to print elements in a list of unknown type
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
