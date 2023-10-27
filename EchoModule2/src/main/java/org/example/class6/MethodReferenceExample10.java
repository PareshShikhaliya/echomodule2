package org.example.class6;

import java.util.ArrayList;
import java.util.Collections;

public class MethodReferenceExample10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Hello", "how", "are", "you?");

        // Using lambda expression
        list.forEach((s) -> System.out.println(s));

        // Using method reference
        list.forEach(System.out::println);
        /*
        This is the method reference version of the lambda expression.
        System.out::println is a method reference that directly calls the
        println method of the System.out object for each string element in the list.
         This is possible because the lambda expression simply invokes a method with no additional logic.
        Both versions achieve the same result of printing each string element in the
         list to the console, but the method reference version is more concise and often considered
          a cleaner way to express this type of operation.

         */
    }
}
