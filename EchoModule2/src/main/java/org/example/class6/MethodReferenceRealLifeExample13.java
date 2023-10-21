package org.example.class6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NameSorter {
    public static int compareByName(String name1, String name2) {
        return name1.compareTo(name2);
    }

    public int compareByLength(String name1, String name2) {
        return Integer.compare(name1.length(), name2.length());
    }
}

public class MethodReferenceRealLifeExample13 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Sort names using reference to a class method
        Collections.sort(names, NameSorter::compareByName);
        System.out.println("Sorted by name: " + names);

        // Sort names using reference to an instance method
        NameSorter nameSorter = new NameSorter();
        Collections.sort(names, nameSorter::compareByLength);

        System.out.println("Sorted by length: " + names);
    }
}
