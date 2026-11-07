package com.kodewala.satic.instance.promblems;

public class User {
	{
		System.out.println("Instrance Block");
		
	}
	User(){
		System.out.println("Default Constructor");
	}
	User(int age){
		this();
		System.out.println("Parameterized Constructor");
	}
	public static void main(String[] args) {
		User u = new User(21);

	}

}
