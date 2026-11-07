package com.kodewala.interfaces.java8.defaultmethod;

public interface BankingService {
	   default void printBalance() {
	        System.out.println("Balance is available");
	    }
	}
//If a class doesn't override a default method, Java uses the inherited default implementation.
	class SavingsAccount implements BankingService { 
	}

	class CurrentAccount implements BankingService {
	    @Override
	    public void printBalance() {
	        System.out.println("Current account balance is available");
	    }
	}

 class BankingDriver {
	    public static void main(String[] args) {
	        BankingService savings = new SavingsAccount();
	        BankingService current = new CurrentAccount();

	        savings.printBalance();
	        current.printBalance();
	    }
	}


