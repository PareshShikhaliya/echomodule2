package org.example.class6;

import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    double price;

    Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
}
@FunctionalInterface
interface DiscountStrategy {
    double applyDiscount(Product product);
}

public class ShoppingApp9 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1000));
        products.add(new Product("Smartphone", 500));
        products.add(new Product("Headphones", 100));

        // Using lambda expressions to define discount strategies
        DiscountStrategy tenPercentDiscount = product -> product.price * 0.1;
        DiscountStrategy twentyPercentDiscount = product -> product.price * 0.2;

        calculateAndPrintDiscounts(products, tenPercentDiscount);
        calculateAndPrintDiscounts(products, twentyPercentDiscount);
    }

    static void calculateAndPrintDiscounts(List<Product> products, DiscountStrategy discountStrategy)
    {
        for (Product product : products)
        {
            double discountAmount = discountStrategy.applyDiscount(product);
            System.out.println("Product: " + product.name + ", Original Price: $" + product.price + ", Discount: $" + discountAmount);
        }
        System.out.println();
    }
}
