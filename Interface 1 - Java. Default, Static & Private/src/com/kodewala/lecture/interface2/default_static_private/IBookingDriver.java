package com.kodewala.lecture.interface2.default_static_private;

public class IBookingDriver {

	public static void main(String[] args) {
		IBooking i = new TrainBooking();
		i.autoUpgrade();
		
		IBooking.printTicket("MMTBB321", "098746");
		
		
		
		
	} 

}
  