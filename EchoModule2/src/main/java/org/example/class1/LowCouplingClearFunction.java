package org.example.class1;

import java.util.ArrayList;
import java.util.List;


// Online Shopping Application - Demonstration of Low Coupling and Clear Functions

// Item class to represent items in the shopping cart
class Item
{
    private String name;
    private double price;

    public Item(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

// ShoppingCart class to handle the shopping cart functionality
class ShoppingCart
{
    private List<Item> items;

    public ShoppingCart()
    {
        items = new ArrayList<>();
    }

    // Method to add items to the shopping cart
    public void addItem(Item item) {
        items.add(item);
    }

    // Method to get the total price of items in the cart
    public double calculateTotalPrice()
    {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    // Bad Practice: Unclear function with multiple responsibilities
    public void processPaymentBad()
    {
        double totalPrice = calculateTotalPrice();
        applyDiscount(totalPrice); // Applies a discount in addition to calculating the total price.
        logTransaction(totalPrice); // Logs the transaction in addition to calculating the total price.
        System.out.println("Payment processed successfully.");
    }

    // Good Practice: Clear function with a single responsibility
    public void processPaymentGood()
    {
        double totalPrice = calculateTotalPrice();
        double discountedPrice = applyDiscount(totalPrice);
        logTransaction(totalPrice);
        System.out.println("Discounted price: $" + discountedPrice);
        System.out.println("Payment processed successfully.");
    }

    // Method to apply a 10% discount to the total price
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.8; // Applying a 8% discount.
    }
    // Method to log the transaction details
    public void logTransaction(double totalPrice) {
        System.out.println("Transaction logged for $" + totalPrice);
    }
}

// Main class to create and interact with the online shopping application
public class LowCouplingClearFunction {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Shirt", 25.99));
        cart.addItem(new Item("Jeans", 39.99));

        // Bad Practice: Unclear function with multiple responsibilities
        System.out.println("Bad Practice:");
        cart.processPaymentBad();

        // Good Practice: Clear function with a single responsibility
        System.out.println("\nGood Practice:");
        cart.processPaymentGood();
    }
}
