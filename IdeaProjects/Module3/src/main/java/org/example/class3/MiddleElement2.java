package org.example.class3;
public class MiddleElement2 {
    public static int findMiddle(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The input array is empty or null.");
        }

        int middleIndex = arr.length / 2;
        return arr[middleIndex];
    }
}
