package com.kodwala.constructorsSuper;

class SuperUser extends Object {
	
	SuperUser(int a ) 
	{
		super(); // calling super class no args constructor

	}

}

public class User extends SuperUser {

	String employeName;
	String employeID;
	String contact;

	User(String employeName, String employeID, String contact) {
		
		super(67); // the first line constructor either super or this. If you are not writing super or this.
		//then compiler will consider super()
		this.employeName = employeName;
		this.employeID = employeID;
		this.contact = contact;

	}

}
