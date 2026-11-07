package com.kodewala.interning;

public class Concept1 {
	public static void main(String[] args) 
	{
		String s1 = "Kodewala Acadamy"; // --> String literal is automatically stored in SCP
		
		String s2 = new String("Kodewala Acadamy"); // --> Creates the new string objects on the heap
		
		// This will output 'false' because s2 points to the new object on the heap, not the SCP
		System.out.println(s1 == s2); // Output will be false 
		
		// Interning s2 : This checks the SCP and returns the reference to the string in the pool 
		
		String s3 = s2.intern();
		
		//Now s3 refers to the same returns the reference in the SCP as s1 
		
		System.out.println(s1 == s3); // output: true 
		
	}

}
