package org.example.class7;

public class InstanceOfExample7 {
    public static void main(String[] args) {
        Object obj = "Hello, Java";

        // Old way: Checking instanceof and then casting
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.toUpperCase());
        }

        // Modern way: Using instanceof and local variable declaration (Java 10+)
        if (obj instanceof String s) {
            System.out.println(s.toLowerCase());
        }
    }
}
