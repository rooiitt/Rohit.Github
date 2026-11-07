package com.kodewala.oops.polymorphism.building03;

public class DriverSatdium {
	public static void main(String[] args) {
		StadiumProcessor s = new StadiumProcessor();
		
		BusinessClasssBooking b = new BusinessClasssBooking();
		s.stadiumProcessor(b);
		
		MidRowBooking m = new MidRowBooking();
		s.stadiumProcessor(m);
		
	}

}
