package org.example.class6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleSortingExample1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("cherry");
        words.add("date");
        words.add("grape");

        Collections.sort(words);

        System.out.println("Sorted words: " + words);
    }
}
