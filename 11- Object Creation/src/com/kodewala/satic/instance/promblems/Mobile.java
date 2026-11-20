package com.kodewala.satic.instance.promblems;

public class Mobile {
	{
		System.out.println("Instance Block");
	}
	public static void main(String[] args) {
		System.out.println("Mobile.main");
		Mobile m = new Mobile();
	}

}
