package com.kodewala.oops.encapsulation.rev;

public class Account {
	private int balance = 1000;

	public void setBalance(int balance) {
		this.balance = balance;

		System.out.println("Account.setBalance()...Account Set Balance ");
	}

	public int getBalance() {
		return balance;
	}

}
