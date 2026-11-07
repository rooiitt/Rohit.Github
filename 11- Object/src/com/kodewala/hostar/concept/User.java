package com.kodewala.hostar.concept;

public class User 
{
	String uderID;
	String userName;
	String type;
	static int LiveUsersCont=0; 
	
	public User(String uderID, String userName, String type) {
		super();
		this.uderID = uderID;
		this.userName = userName;
		this.type = type;
	}

	public User(String userName, String type) {
		super();
		this.userName = userName;
		this.type = type;
	}
	public User()
	{
		
	}
	{
		LiveUsersCont = LiveUsersCont+1;
	}
	

}
