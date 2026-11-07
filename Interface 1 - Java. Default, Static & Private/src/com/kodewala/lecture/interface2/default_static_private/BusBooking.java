package com.kodewala.lecture.interface2.default_static_private;

/*
 * This class is implementing IBooking interface and must implement all the abstract method of
 *  IBooking interface.( 100% contract )
 */

public class BusBooking implements IBooking {

	@Override
	public void book() {
		System.out.println("BusBooking.book()");

	}

	@Override
	public void cancelBooking() {
		System.out.println("BusBooking.cancelBooking()");

	}
 
	@Override
	public Booking checkStatus() {
		
		    Booking booking = new Booking();

		    return booking;
		}
	

	public Search search() {
		Search s = new Search();
		return s;
	}

}
