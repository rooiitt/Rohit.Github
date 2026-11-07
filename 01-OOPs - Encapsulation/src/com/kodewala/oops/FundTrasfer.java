package com.kodewala.oops;

public class FundTrasfer {
	private String accountName;
	private String accountNumber;
	private int balance;
	private int ammount;

	public FundTrasfer(String accountName, String accountNumber, int balance, int ammount) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ammount = ammount;
	}

	int getBalance() {
		return balance;
	}

	int getAmmount() {
		return ammount;
	}

	void fundTrasfer(int ammount) {

		if (ammount <= balance) {
			System.out.println("Original Blance: " + balance);
			System.out.println("transaction Amount: " + ammount);
			balance = balance - ammount;
			System.out.println("Remaning Balance: " + balance);
		}

	}

}
