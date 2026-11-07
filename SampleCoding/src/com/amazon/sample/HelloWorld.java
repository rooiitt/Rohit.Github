package com.amazon.sample;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("Hello WOrld! From Eclips IDE");
		int ammount = 120;		
		System.out.println("Ammount :" + ammount);
		HelloWorld.doSomethings();

	}

	public static void doSomethings() {
		System.out.println("HelloWorld.enclosing_method()");
	}
}
