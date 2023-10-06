package org.example.class3;

public class BankAccount4 {
    private String accountHolder;
    private double balance;

    public BankAccount4(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient balance.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isOverdraft() {
        return balance < 0;
    }

    public boolean isAccountHolder(String name) {
        return accountHolder.equals(name);
    }
}
