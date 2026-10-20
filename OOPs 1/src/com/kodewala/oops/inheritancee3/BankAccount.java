package com.kodewala.oops.inheritancee3;

public class BankAccount {
	public void showBalance()
	{
		System.out.println("The Account Balance ");
	}

}
class DepositAccount extends BankAccount { //--> IS-A Relationship
	
	public void showSaving() {
		System.out.println("The Saving Account");
	}
}
class Bank{
	
	DepositAccount account;  // HAS-A Relationship
	
	public Bank(DepositAccount account) {
		this.account = account;
	}
	public void display() {
		account.showBalance();
		account.showSaving();
		
		
	}
}
