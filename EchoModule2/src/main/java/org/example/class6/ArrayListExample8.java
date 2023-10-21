package org.example.class6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Hello", "how", "are", "you?");

        list.forEach((s) -> {
            String concatenated = s + "!";
            System.out.println(concatenated);
        });
    }
}
