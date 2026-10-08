package com.kodwala.constructors;

public class Driver {
	
	public static void main(String[] args) {
	
	Account obj = new Account();
	
	System.out.println(obj.account + " " + obj.name);
	
	Account obj1 = new Account( 2000, "Kodewala");
	
	System.out.println(obj1.account +" "+ obj1.name);
	
	}
	
	

}

