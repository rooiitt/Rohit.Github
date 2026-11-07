package com.kodewala.oops.overloading;

// Method Overriding
public class Account {
	int minBalance = 10000;
    // Code written....100 lines of code --> X
	 String openAcount(String name, int initBalance) {
		System.out.println("Account.openAcount()");
		return "some string";

	}

}

class SavingAccount extends Account {
	/*
	 * 1.Method name should be same. 
	 * 2.Type, Order and Number of Args should be
	 * same. 
	 * => 3.Return type should be same expect covarient. 
	 * 4.Access modifier --> should be same or widen(public--> public,protected --> protected or
	 * public).
	 * 5. Exception --->
	 * 6. Can not override private method.
	 */
	@Override // you are telling compiler that i am overriding the method. please check all rules 
	public  String openAcount(String name, int initBalance) {
		
		//200 lines of the code --> X+1
		System.out.println("SavingAccount.openAcount()....");
		return "Some other string";

	}
 
}