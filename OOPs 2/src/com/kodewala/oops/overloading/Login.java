package com.kodewala.oops.overloading;
//Method Overloading
/*
 * 1.Works with in the class
 * 2.You have multiple version of same method
 * 3.Same method name  
 * =>4. Order of args, number of args and type of args must be Different.
 * 
 */
public class Login {
	public void doLogin(String mobile, int otp) { //v1
		System.out.println("Login.doLogin()"+ mobile + " , "+otp );
	}

	public String doLogin(String email, String passwoard) { //v2
		System.out.println("Login.doLogin()"+ email +" , "+ passwoard );
		return "some value";
	}

	public void doLogin(String gmail) {
		System.out.println("Login.doLogin(rohit@321)" + gmail);
	}
}
