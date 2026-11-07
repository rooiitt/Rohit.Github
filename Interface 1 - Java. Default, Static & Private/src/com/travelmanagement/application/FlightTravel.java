package com.travelmanagement.application;

public class FlightTravel implements ITravelService {

	@Override
	public Book bookTravel() {
		System.out.println("Book Flight");
		return null;
	}

	@Override
	public Book cancelTravel() {
		System.out.println("Cancel Flight");
		return null;
	}
	public static  boolean  generateTravelId(String id) {
		validateTravelDetails();
		System.out.println("Travel ID" +" "+ id);
		return true;
	
	}

	private static void validateTravelDetails() {
		System.out.println("FlightTravel.validateTravelDetails()");
		
	}
	public static boolean generateTravelDate(String date) {
		validateTravelDetails();
		System.out.println("Your booking date"+" "+ date);
		return true;
	}
}


