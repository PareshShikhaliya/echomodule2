package org.example.class6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortingByLengthExample3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("cherry");
        words.add("date");
        words.add("grape");

        // Create an anonymous class as a LengthComparator
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return Integer.compare(str1.length(), str2.length());
            }
        };


        Collections.sort(words, lengthComparator);

        System.out.println("Sorted words by length: " + words);
    }
}
