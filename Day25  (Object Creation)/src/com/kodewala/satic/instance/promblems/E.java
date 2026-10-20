package com.kodewala.satic.instance.promblems;

/*
 * Static --> Main Method --> Instance ---> Constructor
 * Static --> Instance --> Constructor
 *   
 */

public class E {
	static {
		System.out.println("A");  
	}

	{
		System.out.println("B");
	}

	E() {
	    System.out.println("C");
	}

	public static void main(String[] args) {
		System.out.println("D"); // Main Method
		E e1 = new E();
		System.out.println("E"); //Main Method
		E e2 = new E();
	}

}
