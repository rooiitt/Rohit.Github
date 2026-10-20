package com.kodewala.string1;

public class Concept12 {

	public static void main(String[] args) {
		String s = new String ("ja") + new String ("va");
		
		s.intern();
		
		String s1 = "java";
		
		System.out.println(s == s1);
		

	}

}
