package org.example.class5;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    public static void main(String[] args) {
        // Upper Bound Wildcard
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);

        System.out.println("Sum of integers: " + sumOfList(integers));
        System.out.println("Sum of doubles: " + sumOfList(doubles));

        // Lower Bound Wildcard
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addIntegers(integers);
        addIntegers(objects);

        System.out.println("Numbers list: " + numbers);
        System.out.println("Objects list: " + objects);
    }

    // Upper Bound Wildcard
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // Lower Bound Wildcard
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
}
