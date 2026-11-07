package com.kodewala.oops.polymorphism;

public class Authentication {
	public void authenticate() {
		System.out.println("Authentication.authenticate()...Authentication");
	}

}
class PasswardAuthentication extends Authentication{
	@Override
	public void authenticate() {
		System.out.println("passwardAuthentication.authenticate().....Passward Authentication");
	}
}
class OTPAuthenticator extends Authentication {
	@Override
	public void authenticate() {
		System.out.println("OTPAuthenticator.authenticate().....OTPAuthenticator");
	}
}
class BiometricAuthenticator extends Authentication {
	@Override
	public void authenticate() {
		System.out.println("BiometricAuthenticator.authenticate()....Biometric Authenticator");
	}
	public static void main(String[] args) {
		Authentication a = new PasswardAuthentication ();
		Authentication a1 = new OTPAuthenticator ();
		Authentication a2 = new BiometricAuthenticator ();
		
		a.authenticate();
		a1.authenticate();
		a2.authenticate();
		
	}
}
