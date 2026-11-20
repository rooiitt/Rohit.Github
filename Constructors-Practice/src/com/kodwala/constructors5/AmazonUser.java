package com.kodwala.constructors5;

/**
 *  User sign up page on Amazon prime
 */

public class AmazonUser { 
	String name;
	String type;
	String country;
	
	
	AmazonUser(String name,String type, String country)
	{
		this.name = name;
		this.type = type;
		this.country = country;
	}
	public AmazonUser()
	{
		// system is setting the / int default value
		this("fygwyfwiwf" , "guest_user", "IND");
		System.out.println("Guset User");
	}
	public void display() {
		
		System.out.println( "Name of the customer : " + name);
		System.out.println("Type : " + type);
		System.out.println("Country : " + country);
		
	}

}
