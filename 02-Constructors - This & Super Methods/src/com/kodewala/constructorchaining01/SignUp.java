package com.kodewala.constructorchaining01;

public class SignUp {
	
	public void doSignup()
	{
		// not Asking anything to end user
		
		JioHotsharUser user1 = new JioHotsharUser("email", "mobileNo", "OTP"); // allowing user to sign in
		user1.display();
	}
	public static void main(String[] args) {
        SignUp signup = new SignUp();
        signup.doSignup();
}
}
