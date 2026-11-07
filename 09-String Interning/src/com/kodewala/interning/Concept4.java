package com.kodewala.interning;

public class Concept4 {
	public static void main(String[] args) {
		
	
	String s2 = "Rohit"; // stored in SCP --> Immutable
	String s3 = "Gaikwad"; // SCP
	
	 String s4 = s2 + s3; // Stored inside the heap
	 
	 System.out.println(s4);
	 
	 String s5 = "RohitGaikwad"; // Stored in SCP
	 
	 System.out.println(s5 == s4.intern() ); //TRUE --> if the content of s4 is available on SCP
	                                         //it will start referring. if it is not available it will
	                                         // add and start referring 
	
	}
}

	

	
