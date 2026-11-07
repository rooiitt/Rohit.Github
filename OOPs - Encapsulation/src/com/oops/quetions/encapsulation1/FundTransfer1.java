package com.oops.quetions.encapsulation1;

public class FundTransfer1 {
	private String accountHolderName;
	private String number;
	private double balance;
	private int ammount;

	public FundTransfer1(String accountHolderName, String number, double balance, int ammount) {
		super();
		this.accountHolderName = accountHolderName;
		this.number = number;
		this.balance = balance;
		this.ammount = ammount;
	}

	public void setAmount(int amount) {

		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Transaction successful");
		} else {
			System.out.println("Insufficient balance or invalid amount");
		}

	}

	public double getBalance() {
		return balance;
	}
}
