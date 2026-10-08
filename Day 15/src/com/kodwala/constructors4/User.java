package com.kodwala.constructors4;

class SuperUser extends Object {
	
	SuperUser(int a )
	{
		
	super();

	}
	
}

public class User extends SuperUser{
	String userName;
	String userId;
	String mobile;

	User(String userName , String userId , String mobile ){
		
		super(44); // calling superclass constructor with no args. 
		// first line of constructor is always super() or this(). if you are not writing this constructor will call
		// super as a default()
		this.userName = userName;
		this.userId = userId;
		this.mobile = mobile;
		
	}

}
