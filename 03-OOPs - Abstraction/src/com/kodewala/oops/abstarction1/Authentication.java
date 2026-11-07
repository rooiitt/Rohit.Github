package com.kodewala.oops.abstarction1;

abstract class Authentication {
	
	//visible method
	abstract void authentication();

}

class PasswordAuthentication extends Authentication {

	@Override
	void authentication() {
		System.out.println("PasswordAuthentication.authentication()....Password Authentication ");

	}

}

class OTPAuthentication extends Authentication {

	@Override
	void authentication() {
		System.out.println("OTPAuthentication.authentication()...OTP Authentication");

	}

}

class GoogleAuthentication extends Authentication {

	@Override
	void authentication() {
		System.out.println("GoogleAuthentication.authentication()...Google Authentication");

	}

	public static void main(String[] args) {
		// Password Authentication
		Authentication a = new PasswordAuthentication();
		a.authentication();

		// OTP Authentication
		Authentication a1 = new OTPAuthentication();
		a1.authentication();

		// Google Authentication
		Authentication a2 = new GoogleAuthentication();
		a2.authentication();

	}

}
