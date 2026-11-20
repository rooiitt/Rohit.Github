package com.kodewala.string1;

public class Concept8 {
	public static void main(String[] args) {
		String a = "java";
		String b = new String ("python");
		String c = a;
		
		System.out.println(a == b ); // F
		System.out.println(a.equals(b)); // F
		System.out.println(a == c); // T
			
	}

}
