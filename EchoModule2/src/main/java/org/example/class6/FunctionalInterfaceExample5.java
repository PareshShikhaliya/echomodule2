package org.example.class6;

interface Calculator {
    int operate(int a, int b);

}

public class FunctionalInterfaceExample5 {
    public static void main(String[] args) {
        // Using a lambda expression to implement the Calculator interface
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;

        int result1 = addition.operate(5, 3);       // 5 + 3 = 8
        int result2 = subtraction.operate(10, 4);   // 10 - 4 = 6

        System.out.println("Result of addition: " + result1);
        System.out.println("Result of subtraction: " + result2);
    }
}
