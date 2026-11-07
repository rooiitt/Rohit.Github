package com.kodewala.lecture.interface2.default_static_private;

public class TrainBooking implements IBooking {

	@Override
	public void book() {
		System.out.println("TrainBooking.book()");
		
	}

	@Override
	public void cancelBooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Booking checkStatus() { 
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public Search search() {
		// TODO Auto-generated method stub
		return null;
	}
	 void printTicket( String path , String contents) {
		printTicket("", "");
	}

}
