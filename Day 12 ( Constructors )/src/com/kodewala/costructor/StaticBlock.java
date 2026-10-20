package com.kodewala.costructor;

public class StaticBlock {
	static int a = 8;
	static int b;
	
	static {
		System.out.println("I am static block");
		b = a * 5; // multiplying by 5
		
	}
	public static void main(String [] args) {
		
		StaticBlock obj = new StaticBlock();
		
		System.out.println(StaticBlock.a + " " +StaticBlock.b);
		
		
	}

}
