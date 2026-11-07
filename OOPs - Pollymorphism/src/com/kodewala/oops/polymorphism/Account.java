package com.kodewala.oops.polymorphism;

/*
 * Static --> They belong to class.
 * private --> Private methods cant be overriden
 * final --> Final methods cannot be overriden
 * Variables --> Variables they cannot be polymorphic
 */

public class Account {
	public void calculateInterest() {
		System.out.println("Account.calculateInterest()......Account Interest");
	}

}

class SavingAccount extends Account {
	public void calculateInterest() {
		System.out.println("SavingAccount.calculateInterest()....Saving Account");
	}

	public void withdrawSavings() {
		System.out.println("SavingAccount.withdrawSavings()......Withdrawing Saving");
	}

}

class CurrentAccount extends SavingAccount {
	public void calculateInterest() {
		System.out.println("CurrentAccount.calculateInterest().....Current Account");
	}
	public static void main(String[] args) { //Up-Casting
		Account a = new SavingAccount();
		a.calculateInterest();
		
		SavingAccount s = (SavingAccount) a; // Down-Casting
		s.withdrawSavings();
	}

}