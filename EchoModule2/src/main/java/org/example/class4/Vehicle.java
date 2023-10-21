package org.example.class4;

// Define the interface with a default method
public interface Vehicle
{
    void start(); // Abstract method
    void stop(); // Abstract method
    default void honk() {
        System.out.println("Honking the horn");
    }
}