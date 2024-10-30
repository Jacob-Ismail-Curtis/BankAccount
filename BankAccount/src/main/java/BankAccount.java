package org.example;

public class BankAccount {
    private double balance;
    private double minimumBalance;
    private String accountHolderName;

    //Constructors
    public BankAccount(double balance, double minimumBalance, String accountHolderName) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    public BankAccount(){};

    //Getters and setters

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", minimumBalance=" + minimumBalance +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }

    public double deposit(double amount) {
        if (amount<=0){
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0.");
        } else {
            balance+=amount;
        }
        return amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be above 0")
        }
        if (balance-amount<minimumBalance){
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance-=amount;
    }

}
