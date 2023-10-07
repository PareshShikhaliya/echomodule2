package org.example.class1;

// Encapsulation example with a BankAccount class

// Class representing a bank account
class BankAccount
{
    private String accountName;
    private long accountNumber;
    public double balance;


    // Constructor to create a bank account
    public BankAccount(String accountHolderName, long accountNumber) {
        this.accountName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Initialize balance to zero
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Method to check the account balance
    public double getBalance() {
        return balance;
    }

    // Method to get the account holder's name
    public String getAccountHolderName() {
        return accountName;
    }

    // Method to get the account number
    public long getAccountNumber() {
        return accountNumber;
    }
}

// Main class to create and interact with bank accounts
public class Encapsulation {
    public static void main(String[] args)
    {
        // Create a bank account
        BankAccount account1 = new BankAccount("John Doe", 123456789);
        System.out.println(account1.getAccountHolderName());

        // Deposit money into the account
        account1.deposit(1000.0);

        // Withdraw money from the account
        account1.withdraw(500.0);

        // Check the account balance
        System.out.println("Account holder: " + account1.getAccountHolderName());
        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Current balance: " + account1.getBalance());
    }
}

/*
In this cool bank account program, we have a class called BankAccount, which represents a bank account of a user.
Each bank account has some important information like the account holder's name, account number, and balance
(how much money is in the account).

To make sure that this information is safe and not directly accessible from outside the class,
 we use a special
 technique called "encapsulation." We keep these important details hidden inside the class by making them private.
  This means that no one can see or change the account holder's name, account number, or balance directly.
 */
