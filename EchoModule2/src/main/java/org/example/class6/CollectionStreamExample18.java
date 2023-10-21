package org.example.class6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class ProductClass {
    private String name;
    private double price;
    private String category;

    public ProductClass(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ") - " + category;
    }
}

public class CollectionStreamExample18 {
    public static void main(String[] args) {
        List<ProductClass> products = new ArrayList<>();
        products.add(new ProductClass("Laptop", 1200.0, "Electronics"));
        products.add(new ProductClass("Phone", 800.0, "Electronics"));
        products.add(new ProductClass("Tablet", 500.0, "Electronics"));
        products.add(new ProductClass("Shirt", 25.0, "Clothing"));
        products.add(new ProductClass("Jeans", 50.0, "Clothing"));
        products.add(new ProductClass("Shoes", 80.0, "Footwear"));

        // Filter products in the Electronics category
        List<ProductClass> electronicsProducts = products.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .collect(Collectors.toList());

        System.out.println("Electronics Products:");
        electronicsProducts.forEach(System.out::println);

        // Map products to their names
        List<String> productNames = products.stream()
                .map(ProductClass::getName)
                .collect(Collectors.toList());

        System.out.println("ProductClass Names:");
        productNames.forEach(System.out::println);

        // Sort products by price (ascending)
        List<ProductClass> sortedProducts = products.stream()
                .sorted(Comparator.comparingDouble(ProductClass::getPrice))
                .collect(Collectors.toList());

        System.out.println("Sorted Products:");
        sortedProducts.forEach(System.out::println);

        // Calculate the total price of all products
        double totalPrice = products.stream()
                .mapToDouble(ProductClass::getPrice)
                .sum();

        System.out.println("Total Price: $" + totalPrice);
    }
}
