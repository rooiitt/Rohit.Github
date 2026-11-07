package com.oops.quetions.encapsulation2;

public class FundTransfer {
	// Private store the account details
	private String accountHolderNmae;
	private String accountNumber;
	private double balance = 5000.0; // Initial Balance
	private int amount;

	public FundTransfer(String accountHolderNmae, String accountNumber, double balance, int amount) {
		super();
		this.accountHolderNmae = accountHolderNmae;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.amount = amount;
	}

	// Withdraw money if the amount is valid
	public void withdrawal(int amount) {  //set method
		if (amount > 0 && amount <= balance) {
			this.balance = balance - amount;
			System.out.println("Transfer Successful");
		} else {
			System.out.println("Invalid amount");
		}

	}

	// get method
	public double amountAdded() {
		return balance;

	}

}
