package org.example.class6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
    private int orderId;
    private int customerId;
    private double amount;

    public Order(int orderId, int customerId, double amount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order #" + orderId + " (Customer #" + customerId + ", Amount: $" + amount + ")";
    }
}

public class OrderCollectorsExample20 {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 101, 150.0));
        orders.add(new Order(2, 102, 200.0));
        orders.add(new Order(3, 101, 50.0));
        orders.add(new Order(4, 103, 100.0));
        orders.add(new Order(5, 102, 75.0));

        // Grouping orders by customer ID
        Map<Integer, List<Order>> ordersByCustomer = orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomerId));

        System.out.println("Orders Grouped by Customer ID:");
        ordersByCustomer.forEach((customerId, orderList) -> {
            System.out.println("Customer #" + customerId + ": " + orderList);
        });
    }
}
