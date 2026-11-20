package com.kodewala.string1;

public class Concept11 {

	public static void main(String[] args) {
		String a = "Java";
		String b = a + "va";
		String c = b + "va ";

		System.out.println(a == b);
		System.out.println(a == c.intern());

	}

}
