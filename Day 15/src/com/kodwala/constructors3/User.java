package com.kodwala.constructors3;


class SuperUser extends Object
{
	
}

public class User {
	String userName;
	String userId;
	String mobile;
	
	User(String userName , String userId , String mobile ){
		
		this(400); // calling the same class [this()]
		this.userName = userName;
		this.userId = userId;
		this.mobile = mobile;
		
	}
	
	User(int age)
	{
		System.out.println("calling the same class construction");
			
	}
	
public void display() {
	
	System.out.println("User Name : " + userName);
	System.out.println("User ID : " + userId);
	System.out.println("User Mobile : " + mobile);
		
}
}
	

