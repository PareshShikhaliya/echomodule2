package org.example.class6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Hello", "how", "are", "you?");
        list.forEach((s) -> System.out.println(s));
    }
}
