package com.kodewala.oops.encapsulation;

public class User {
	// u.getName() --> Can read the name, but cannot change it.
	private String name = "Rohit";

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Main5 {
	public static void main(String[] args) {
		User u = new User("Rohan");
		System.out.println(u.getName());
	}
}
