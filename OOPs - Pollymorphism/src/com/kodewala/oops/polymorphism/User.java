package com.kodewala.oops.polymorphism;

/*
 * || Up-casting and Down-casting ||
 */

public class User {

}

class AdminUser extends User {

}

class FinanceUser extends AdminUser {

}

class Driver {
	public static void main(String[] args) {
		User u1 = new User(); // User class is referring User class object.
		AdminUser u2 = new AdminUser();
		
		User s = (User) new AdminUser(); // Parent class can refer child class object --> Auto up casting 
		Object o = new FinanceUser();
		
		AdminUser a = (AdminUser) new User();  // Child class is referring to parent class object --> Down casting
	}

}