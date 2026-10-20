package com.kodewala.oops.overloading;

public class Client {
	public static void main(String[] args) {
		
		Login l = new Login();
		l.doLogin("@gmail.com");
		l.doLogin("Iphone 15", 1232);
		l.doLogin("@gmail.com", "rohit@#@!");// this will call from the main account the changes here will not,
		               // be occur 
		
	}

}
