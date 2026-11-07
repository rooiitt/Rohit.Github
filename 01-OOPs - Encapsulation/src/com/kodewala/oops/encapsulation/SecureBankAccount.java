package com.kodewala.oops.encapsulation;

public class SecureBankAccount {
	private int accountNumber;
	private double balance;
	private int dailyWithdrawal;

	private final int DAILY_LIMIT = 20000;

	public SecureBankAccount(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = accountNumber;
		this.dailyWithdrawal = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(int amount) {
	    if (amount > 0) {
	        this.balance += amount;
	        System.out.println("Deposit Successful");
	    } else {
	        System.out.println("Invalid Deposit");
	    }
	}

	public void withdraw(int amount) {
		if (amount <= 0) {
			System.out.println("Invalid Withdrawal Amount");
		} else if (amount > balance) {
			System.out.println("Insufficient balnce");
		} else if (dailyWithdrawal + amount > DAILY_LIMIT) {
			System.out.println("Daily withdrawal limit exceeded");
		} else {
			this.balance -= amount;
			this.dailyWithdrawal += amount;
			System.out.println("Withdrawal Successful");
		}
	}

}

class SecureBankAccountDriver {
	public static void main(String[] args) {
		SecureBankAccount s = new SecureBankAccount(42345);

		s.deposit(30000);
		s.withdraw(12000);
		s.withdraw(10000);

		System.out.println("Account Number: " + s.getAccountNumber());
		System.out.println("Balance: " + s.getBalance());

	}

}
