package com.kodewala.control.flow1;

public class MakeMyDriver {
	public static void main(String[] args) 
	{
		// Create an object of the MakeMyTrip class
		MakeMyTrip mmt = new MakeMyTrip();
		// Call the method with a trip amount of 13000
		String ans = mmt.disscoApply(13000);
		// Print the discount message
		System.out.println(ans);
		
	}

}
