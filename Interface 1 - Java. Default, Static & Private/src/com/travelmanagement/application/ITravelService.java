package com.travelmanagement.application;

public interface ITravelService {
	Book bookTravel();
	Book cancelTravel();
	
	default void sendConformation(){
		connecttoDB();
		System.out.println("Sending Conformation");
	}
	default void genrateInvoice() {
		connecttoDB();
		System.out.println("Genrate Invoice");
		
	}
	public static  boolean  generateTravelId(String id) {
		validateTravelDetails();
		System.out.println(" Your Travel  ID");
		return true;
		
	}
	public static boolean generateTravelDate(String date) {
		validateTravelDetails();
		System.out.println("Your Trvel Date ");
		return true;
		
		
	}
	private void connecttoDB() {
		System.out.println("Connected To Database");
		
	}
	private static void validateTravelDetails() {
		System.out.println("Validate Travel Details");
	}
	

}
