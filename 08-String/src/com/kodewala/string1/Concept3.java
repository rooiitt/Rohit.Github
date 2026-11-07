package com.kodewala.string1;

public class Concept3 {
	public static void main(String[] args) 
	{
		//Litrals 
		String s1 = "Kodewala"; //SCP
		
		String s2 = "Kodewala"; //SCP
		
		// new Keyword
		String s3 = new String ("Kodewala"); // stored in scp "" used + in heap with new object
		
		String s4 = new String ("Kodewala"); // new keywords creates new object inside heap
		
		//Comparing the memory address
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s3 == s4 : " + (s3 == s4));
		System.out.println("s1 == s3 : " + (s1 == s3));
		
		
		
		//Comparing Meaningfully equal or not 
		System.out.println("s1.equals (s2) : " + s1.equals (s2)); // True equal checks Content are same or NOT
		System.out.println("s3.equals (s4) : " + s3.equals (s4));
		System.out.println("s4.equals (s3) : " + s4.equals(s3));
		
		
	}

}
