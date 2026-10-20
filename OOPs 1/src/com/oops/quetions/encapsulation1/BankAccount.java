package com.oops.quetions.encapsulation1;

public class BankAccount {
	private double balance = 5000;
	private int ammount;

	public void BankAccount(int ammount) {
		
		this.balance = balance;
		this.ammount = ammount;
	}

	public void setBalance(int ammount) {
		if (ammount > 0 && ammount <= balance) {
			balance = balance - ammount;
			System.out.println("Transaction successful");
		}else {
			System.out.println("Insufficient balance");
		}

	}
	public double getBalance() {
        return balance;
	

}
}