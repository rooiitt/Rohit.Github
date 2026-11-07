package com.kodewala.control.flow1;

public class Driver {

	public static void main(String[] args) {
		
		TripPlanner plan = new TripPlanner();
		String response = plan.suggestPlan("BLR", "GOA", 20000);

	}

}
