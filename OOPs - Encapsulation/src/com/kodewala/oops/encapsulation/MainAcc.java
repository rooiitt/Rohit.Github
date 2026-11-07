package com.kodewala.oops.encapsulation;

public class MainAcc {

	    public static void main(String[] args) {

	        BankAccount b = new BankAccount();

	        // Access balance using getter
//	        System.out.println(account.getBalance());

	        // Update balance using setter
	        b.withdraw(2000);
	        System.out.println("Remaining balance " + b.getBalance());

	        // Access updated balance
//	        System.out.println(account.getBalance());

	        // Try setting a negative balance
	        

//	        System.out.println(account.getBalance());
	    }
	}


