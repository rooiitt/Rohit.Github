package com.travelmanagement.application;

public class TrainTravel implements ITravelService {

	@Override
	public Book bookTravel() {
		System.out.println("Book Train");
		return null;
	}

	@Override
	public Book cancelTravel() {
		System.out.println("Cancel Train");
		return null;
	}

	public static boolean generateTravelId(String id) {
		validateTravelDetails();
		System.out.println(" Your Travel  ID" + " " + id);
		return true;

	}

	private static void validateTravelDetails() {
		System.out.println("TrainTravel.validateTravelDetails()");

	}

	public static boolean generateTravelDate(String date) {
		validateTravelDetails();
		System.out.println("Your Trvel Date " +" "+ date);
		return true;
	}
}
