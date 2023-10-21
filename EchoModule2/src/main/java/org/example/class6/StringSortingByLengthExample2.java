package org.example.class6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return Integer.compare(str1.length(), str2.length());
    }
}

public class StringSortingByLengthExample2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("cherry");
        words.add("date");
        words.add("grape");

        // Create an instance of LengthComparator and use it for sorting
        Comparator<String> lengthComparator = new LengthComparator();
        Collections.sort(words, lengthComparator);

        System.out.println("Sorted words by length: " + words);
    }
}
