package com.kodewala.constructor;

public class SignUp {
	
	public void doSignup()
	{
		// not askin anything to end user
		
		JioHotsharUser user1 = new JioHotsharUser("email", "mobileNo", "OTP"); // allowing user to sign in
		user1.display();
	}
}
