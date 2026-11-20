package com.kodewala.satic.instance.promblems;

public class Student {
	public static void main(String[] args) { // static block  will execute after the loading the class
		System.out.println("Mian Method");
	}
	static {
		System.out.println("Student Block");
		
	}

}

