package com.kodewala.control.flow1;

public class MakeMyTrip {
	public String disscoApply( int ammount) {
		String  disscount = null;
		if ( ammount < 5000) {
			disscount = "Sorry you did not get any discount";
		}
		else if (ammount >= 5000 && ammount <= 10000)
		{
			disscount = " You get 10% disscount on your trip";
		}
		else if (ammount >= 10000 && ammount <= 15000)
		{
			disscount = " Maximum disscount for our Customer is 1250 only";
		}
		 return disscount;
		 
		 
			
	}
}
