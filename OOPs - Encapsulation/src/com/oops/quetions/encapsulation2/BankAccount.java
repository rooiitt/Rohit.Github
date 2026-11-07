package com.oops.quetions.encapsulation2;

public class BankAccount {
	private double balance = 5000;

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) { // Focus
			this.balance = balance - amount;
			System.out.println("Ammount Withdraw : " + amount);
			System.out.println("Ammount Remaining : " + balance);

		} else {
			System.out.println("Invalid ammount or insufficietnt balance");
		}

	}

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.withdraw(800);

	}

}
