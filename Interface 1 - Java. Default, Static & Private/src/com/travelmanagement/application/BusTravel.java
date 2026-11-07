package com.travelmanagement.application;

public class BusTravel implements ITravelService {

	@Override
	public Book bookTravel() {
		System.out.println("Book BusTravel");
		return null;
	}

	@Override
	public Book cancelTravel() {
		System.out.println("Cancel BusTravel");
		return null;
	}

}
