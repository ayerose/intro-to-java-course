package com.cbfacademy.accounts;

public class Account {
    protected int accountNumber;
    protected double balance;


    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    //  deposit funds
    public double deposit(double amount) {
        this.balance += amount;
        return balance;
    }

    // withdraw funds
    public double withdraw(double requested) {
        if (balance >= requested) {
            this.balance -= requested;
            return requested;
        } else {
            return 0; // insufficient funds
        }
    }
}
