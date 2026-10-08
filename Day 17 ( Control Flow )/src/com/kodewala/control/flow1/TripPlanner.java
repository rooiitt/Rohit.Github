package com.kodewala.control.flow1;

public class TripPlanner {
	public String suggestPlan(String search , String destination , int budget ) {
		String suggestion = null;
		if (budget <= 1000)
		{
			suggestion = "You can be home only!!";
			System.out.println(suggestion);
		}
		else if (budget > 1000 && budget <= 3000) 
		{
			suggestion = "You can visit with in city like lal bagh etc...or you can watch movie near by";
			System.out.println(suggestion);
			
		}
		else if (budget > 3000 && budget <= 5000)
		{
			suggestion = "You can hire a text and vist and visit near by places like mysore etc..";
			System.out.println(suggestion);
		}
		else
		{
			suggestion = "You can vist goa!";
			System.out.println(suggestion);
		}
		return suggestion;
	}

}
