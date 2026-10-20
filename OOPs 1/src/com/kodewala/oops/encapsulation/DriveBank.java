package com.kodewala.oops.encapsulation;

public class DriveBank {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.withdraw(2000);
		System.out.println("Current Balence: " + b.getBalance());

	}

}
