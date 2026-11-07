package com.kodewala.oops;

public class User {

	private String name = "Rohit";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Main3 {
	public static void main(String[] args) {
		User u = new User();
		System.out.println(u.getName());
	}
}
