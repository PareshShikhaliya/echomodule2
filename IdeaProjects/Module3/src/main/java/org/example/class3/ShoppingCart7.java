package org.example.class3;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart7 {
    private Map<String, Double> items = new HashMap<>();

    public void addItem(String itemName, double price) {
        items.put(itemName, price);
    }

    public void removeItem(String itemName) {
        items.remove(itemName);
    }

    public double calculateTotalPrice() {
        return items.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    public int getItemCount() {
        return items.size();
    }
}
