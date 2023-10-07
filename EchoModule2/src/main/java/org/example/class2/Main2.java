package org.example.class2;

abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract method: no implementation provided
    public abstract void deposit(double amount);

    // Abstract method: no implementation provided
    public abstract void withdraw(double amount);

    // Concrete method: complete implementation provided
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // New method specific to SavingsAccount
    public void applyInterest() {
        balance += balance * interestRate / 100;
    }
}

public class Main2 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("1001", 1000, 500);
        SavingsAccount savingsAccount = new SavingsAccount("2001", 2000, 2.5);

        // Depositing and withdrawing from both accounts
        checkingAccount.deposit(500);
        checkingAccount.withdraw(300);
        checkingAccount.withdraw(1500); // Will exceed overdraft limit

        savingsAccount.deposit(1000);
        savingsAccount.withdraw(800);
        savingsAccount.applyInterest();

        // Displaying account information
        System.out.println("--- Checking Account Info ---");
        checkingAccount.displayAccountInfo();

        System.out.println("\n--- Savings Account Info ---");
        savingsAccount.displayAccountInfo();
    }
}
