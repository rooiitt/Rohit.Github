package com.travelmanagement.application;

public class ITravelServiceDriver {
	public static void main(String[] args) {
		ITravelService travelservice = new FlightTravel();
		

		travelservice.genrateInvoice();
		travelservice.sendConformation();
		travelservice.bookTravel();
		travelservice.cancelTravel();
		
		FlightTravel.generateTravelDate("12-31-2026");
		FlightTravel.generateTravelId("ABC123");
	}

}
