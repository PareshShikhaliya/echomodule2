package org.example.class5;

import java.util.ArrayList;
import java.util.List;

// Generic Product class to store products of any type
class Product<T>
{
    private T product;

    public Product(T product) {
        this.product = product;
    }

    public T getProduct() {
        return product;
    }
}

// Sample Electronics class
class Electronics {
    private String name;
    private String brand;
    private double price;

    public Electronics(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
}

// Sample Clothes class
class Clothes {
    private String type;
    private String size;
    private String color;
    private double price;

    public Clothes(String type, String size, String color, double price) {
        this.type = type;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}

public class InventoryManagementSystem7 {
    public static void main(String[] args)
    {
        InventoryManagementSystem7 ims = new InventoryManagementSystem7();

        // Create inventory lists for different product types
        List<Product<Electronics>> electronicsInventory = new ArrayList<>();
        List<Product<Clothes>> clothesInventory = new ArrayList<>();

        // Add electronics to the electronics inventory
        electronicsInventory.add(new Product<>(new Electronics("Laptop", "HP", 999.99)));
        electronicsInventory.add(new Product<>(new Electronics("Smartphone", "Samsung", 599.99)));

        // Add clothes to the clothes inventory
        clothesInventory.add(new Product<>(new Clothes("Shirt", "M", "Blue", 29.99)));
        clothesInventory.add(new Product<>(new Clothes("Jeans", "32", "Black", 39.99)));

        // Retrieve and display inventory details
        System.out.println("Electronics Inventory:");
        ims.displayInventoryDetails(electronicsInventory);

        System.out.println("\nClothes Inventory:");
        ims.displayInventoryDetails(clothesInventory);
    }

    // Generic method to display inventory details
    <T> void displayInventoryDetails(List<Product<T>> inventory)
    {
        for (Product<T> product : inventory) {
            T item = product.getProduct();
            if (item instanceof Electronics) {
                Electronics electronics = (Electronics) item;
                System.out.println("Name: " + electronics.getName() + ", Brand: " + electronics.getBrand() + ", Price: $" + electronics.getPrice());
            } else if (item instanceof Clothes) {
                Clothes clothes = (Clothes) item;
                System.out.println("Type: " + clothes.getType() + ", Size: " + clothes.getSize() + ", Color: " + clothes.getColor() + ", Price: $" + clothes.getPrice());
            }
        }
    }
}
