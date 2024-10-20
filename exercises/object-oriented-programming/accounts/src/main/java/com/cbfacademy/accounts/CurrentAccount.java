package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // getters and setters for overdraft limit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // override the withdrawmethod to allow overdraft withdrawals
    @Override
    public double withdraw(double requested) {
        if (balance + overdraftLimit >= requested) {
            this.balance -= requested;
            return requested;
        } else {
            return 0; // Insufficient funds
        }
    }
}
