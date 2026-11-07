package com.kodewala.oops.polymorphism.building02;

public class ComformYourBooking {
	public static void main(String[] args) {
		BookTicket b = new BookTicket();

		// book ticket for FirstClass
		FirstClassBooking f = new FirstClassBooking();
		b.bookTicket(f);

		// book ticket for BusinessBooking
		BusinessBooking b1 = new BusinessBooking();
		b.bookTicket(b1);
		
		// book ticket for EconomyBooking
		
		EconomyBooking e = new EconomyBooking();
		b.bookTicket(e);
		

	}

}
