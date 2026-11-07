package com.kodewala.oops;

public class Payment {
	private int balance; // Must be declare Private --> Data or Variable 

	public Payment(int balance) {
		super();
		this.balance = balance;
	}

	// setter 
	public void deDebit(int _ammount) {
		
		// Modifying the data
		this.balance = balance - _ammount;
	}

	public void doCredit(int _ammount) { // allow to change the data with Controlled Access.
		
		// Modifying the data
		if (_ammount > 0) {    //Controlled Access
			this.balance = balance + _ammount;
		}
	}
    //Getter
	public int getBalnce() { // Method to read the value 
		return balance;
	}
}
