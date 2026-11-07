package com.kodewala.oops.polymorphism.downcasting;

public class Authentication {
	public void authenticate() {
		System.out.println("Authentication.authenticate()......Authentication");
	}

}

class PasswordAuthentication extends Authentication {
	public void validatePassword() {
		System.out.println("PasswordAuthentication.validatePassword().....Password Validate");
	}
}

class OTPAuthentication extends PasswordAuthentication {
	public void verifyOTP() {
		System.out.println("OTPAuthentication.verifyOTP().....OTP Varification");
	}

	public static void main(String[] args) {
		Authentication a = new OTPAuthentication();

		OTPAuthentication o = (OTPAuthentication) a;
		o.authenticate();
		o.validatePassword();
		o.verifyOTP();
		

	}
}
