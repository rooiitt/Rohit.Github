package com.kodewala.constructor;

public class JioHotsharUser {
	
	String email;
	String mobileNo;
	String OTP;
	
	JioHotsharUser(String email ,String mobileNo ,String OTP )
	{
		this.email = email;
		this.mobileNo = mobileNo;
		this.OTP = OTP;
		
		
	}
	public JioHotsharUser(int value)
	{   // system is setting ? init default value 
		this ("rohit.wyd@gmail.com" , "8890764432" , "5566");
	}// calling the constructor 
		
	public void display () {
		System.out.println( "Name of the customer : " + email);
		System.out.println("Type : " + mobileNo);
		System.out.println("Country : " + OTP);
	}

}
