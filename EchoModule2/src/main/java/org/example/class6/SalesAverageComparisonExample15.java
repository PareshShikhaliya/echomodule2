package org.example.class6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class SalesTransaction
{
    private double amount;

    public SalesTransaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

public class SalesAverageComparisonExample15
{
    public static void main(String[] args) {
        List<SalesTransaction> transactions = new ArrayList<>();
        transactions.add(new SalesTransaction(150.0));
        transactions.add(new SalesTransaction(200.0));
        transactions.add(new SalesTransaction(120.0));
        transactions.add(new SalesTransaction(180.0));

        // Imperative-style approach
        double sum = 0.0;
        for (SalesTransaction transaction : transactions) {
            sum += transaction.getAmount();
        }
        double average = sum / transactions.size();
        System.out.println("Average Sale Amount (Collections): " + average);

        // Functional-style approach
        double averageStream = transactions.stream()
                .mapToDouble(SalesTransaction::getAmount)
                .average()
                .orElse(0.0);
        System.out.println("Average Sale Amount (Streams): " + averageStream);
    }
}
