package com.kodewala.oops.encapsulation;


public class BankAccount {

    private double balance = 5000; //Initial Balance 

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { 
            balance = balance - amount; // Deduct the withdrawal amount
            System.out.println("Transaction successful");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public double getBalance() { //Get methods --> returns the remaining balance
        return balance;
    }

}
