package com.oops.quetions.encapsulation1;

public class DriveBank {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setBalance(2000);
		System.out.println("Current Balence: " + b.getBalance());

	}

}
