package com.kodwala.constructors;

public class Account {
	
	int account;
	String name;
	
	Account()
	{
		System.out.println("inside Account()");
	}
	
	Account(int amount, String name)
	{
		this.account = amount;
		this.name = name;
		
	}

}
