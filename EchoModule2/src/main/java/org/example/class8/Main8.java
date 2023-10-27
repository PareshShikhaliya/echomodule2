package org.example.class8;

class BankAccount {
    String accountNumber = generateAccountNumber(); // Instance variable with initializer
    String ownerName;                               // Instance variable without initializer
    double balance;                                 // Instance variable without initializer

    BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        System.out.println("Bank account created for " + ownerName);
    }

    String generateAccountNumber() {
        String accountNumber = "ACC" + System.currentTimeMillis();
        System.out.println("Generating account number: " + accountNumber);
        return accountNumber;
    }
}

public class Main8 {
    public static void main(String[] args)
    {
        BankAccount account1 = new BankAccount("Alice", 1000.0);
        System.out.println("---");
        BankAccount account2 = new BankAccount("Bob", 1500.0);
    }
}
