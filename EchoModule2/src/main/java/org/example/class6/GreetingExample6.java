package org.example.class6;

@FunctionalInterface
interface Greeting {
    void greet(String name);
}

public class GreetingExample6 {
    public static void main(String[] args) {
        // Using a lambda expression to implement the Greeting interface
        Greeting helloGreeting = (name) -> System.out.println("Hello, " + name + "!");
        Greeting byeGreeting = (name) -> System.out.println("Goodbye, " + name + "!");

        helloGreeting.greet("Alice");   // Output: Hello, Alice!
        byeGreeting.greet("Bob");       // Output: Goodbye, Bob!
    }
}
