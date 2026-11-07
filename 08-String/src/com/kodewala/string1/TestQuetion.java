package com.kodewala.string1;

public class TestQuetion {
	public static void main(String[] args) {
		

		String s2 = new String ("Rohit");
		s2 = s2.intern(); // Store the SCP reference in s2
		String s1 = "Rohit";
	    System.out.println( s1 == s2 );
		
		String s3  = new String ("Ro") + new String ("hit");
		s3 = s3.intern(); // Store the SCP refrance in s3
		String s4 = "Rohit";
		System.out.println(s3 == s4);
	}

}
