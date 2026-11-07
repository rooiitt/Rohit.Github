package com.kodewala.interfaces.java9.privatemethods;

/*
 * Ultimate Private Method
 */

public interface IBooking {
	Book book();

	default void autoUpgrade() {
		connectToDataBase();
		System.out.println("Auto Upgrade");
	}

	default void sendNotification() {
		connectToDataBase();
		System.out.println("Sending Notification");
	}

	public static void printTicket() {
		validateBookingId();
		System.out.println("Print Ticket");
	}

	private void connectToDataBase() {
		System.out.println("Connected to DataBase");
	}

	private static void validateBookingId() {
		System.out.println("Validate Booking");
	}

}

class FlightBooking implements IBooking {

	@Override
	public Book book() {
		System.out.println("Booking Started");

		return null;
	}

}

class IBookingDriver {
	public static void main(String[] args) {

		IBooking ibooking = new FlightBooking();
		ibooking.book();
		ibooking.autoUpgrade();
		ibooking.sendNotification();
		
		IBooking.printTicket(); // public static method
		

	}
}