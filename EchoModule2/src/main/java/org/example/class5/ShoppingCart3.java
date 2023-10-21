package org.example.class5;

import java.util.ArrayList;

public class ShoppingCart3 {
    public static void main(String[] args)
    {
        ArrayList cartItems = new ArrayList();

        // Adding items of different types to the cart
        cartItems.add(new Book("Java Programming", "John Doe"));
        cartItems.add(new ElectronicDevice("Smartphone", "Samsung"));
        cartItems.add(new Clothing("T-shirt", "Blue", "M"));

        // Incorrectly adding an item of wrong type to the cart
        cartItems.add(42);

        // Suppose we want to retrieve the first item from the cart
        Book firstItem = (Book)cartItems.get(0);

    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class ElectronicDevice {
    private String type;
    private String brand;

    public ElectronicDevice(String type, String brand)
    {
        this.type = type;
        this.brand = brand;
    }

    // Getters and setters for type and brand
}

class Clothing {
    private String type;
    private String color;
    private String size;

    public Clothing(String type, String color, String size)
    {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    // Getters and setters for type, color, and size
}
