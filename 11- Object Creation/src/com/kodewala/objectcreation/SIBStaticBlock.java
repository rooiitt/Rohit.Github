package com.kodewala.objects;

public class Userstatic {
	String userNumber;
	String userID;
	String mobileNumber;

	public Userstatic(String userNumber, String userID, String mobileNumber) {
		super(); // either this() or super()
		System.out.println("String userNumber, String userID, String mobileNumber..Constructor");
		this.userNumber = userNumber;
		this.userID = userID;
		this.mobileNumber = mobileNumber;
		
	
	}
	static  // static block will get executed just after the class loading.
	{
		System.out.println("Im in static inti block ");
	}

}
