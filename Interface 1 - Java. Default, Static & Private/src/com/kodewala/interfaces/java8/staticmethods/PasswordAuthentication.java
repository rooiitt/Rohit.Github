package com.kodewala.interfaces.java8.staticmethods;

public interface PasswordAuthentication {
	static boolean validatePassword(String password) {
		password.length();
		if (password.length() >= 8) {
			System.out.println("Validate Requiremnet");
		} else {
			System.out.println("Invalid Requirement");
		}
		return true;

	}
}

class EmailAuthentication implements PasswordAuthentication {

}

class MobileAuthentication implements PasswordAuthentication {

}

class AdminAuthentication implements PasswordAuthentication {

}

class PasswordDriver {
	public static void main(String[] args) {
	boolean emailauthentication = PasswordAuthentication.validatePassword("hwkfwfwfwf");
	System.out.println(emailauthentication);
	
	boolean mobileauthentication = PasswordAuthentication.validatePassword("gwf");
	System.out.println(mobileauthentication);
	
	boolean adminauthentication = PasswordAuthentication.validatePassword("ahfieuwigfwif");
	System.out.println(adminauthentication);

	}
}