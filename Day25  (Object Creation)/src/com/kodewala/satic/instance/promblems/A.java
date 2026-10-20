package com.kodewala.satic.instance.promblems;

public class A {
	static {
		System.out.println("Static Block 1");
	}

}
class B{
	static {
		System.out.println("Static Block 2");
	}
	public static void main(String[] args) {
		B b = new B();
	}
}
