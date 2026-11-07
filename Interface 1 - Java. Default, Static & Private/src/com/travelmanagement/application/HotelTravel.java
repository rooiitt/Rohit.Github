package com.travelmanagement.application;

public class HotelTravel implements ITravelService {

	@Override
	public Book bookTravel() {
		System.out.println("Book HotelTravel");
		return null;
	}

	@Override
	public Book cancelTravel() {
		System.out.println("Cancel HotelTravel");
		return null;
	}

}
