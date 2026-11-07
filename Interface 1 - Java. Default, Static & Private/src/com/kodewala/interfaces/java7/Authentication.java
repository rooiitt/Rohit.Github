package com.kodewala.interfaces.java7;

public interface Authentication {
	void verifyAccount();

}
class Password implements Authentication{

	@Override
	public void verifyAccount() {
		System.out.println("Password Verify");
		
	}
	
}
class OTP implements Authentication{

	@Override
	public void verifyAccount() {
		System.out.println("Verifying OTP");
		
	}
	
}
class GoogleBased implements Authentication{

	@Override
	public void verifyAccount() {
		System.out.println("Google Based VerifyAccount");
		
	}
	
}
class VerifyProcessor{
	void verifyProcessor(Authentication verify) {
		verify.verifyAccount();
	}
}
class AuthenticationDriver{
	public static void main(String[] args) {
		VerifyProcessor verifyProcessor = new VerifyProcessor();
		
		Authentication a = new Password();// Password Verify
		Authentication a1 = new OTP();
		Authentication a2 = new GoogleBased();
		
		
		verifyProcessor.verifyProcessor(a);
		verifyProcessor.verifyProcessor(a1);
		verifyProcessor.verifyProcessor(a2);
		
		
		
		
	}
}
