package com.kodewala.lecture.interface2.default_static_private;

/*
 * IN 2010 --> Make my trip JAVA.7
 */
public interface IBooking {
	void book();

	void cancelBooking();

	Booking checkStatus();

	Search search();

	/*
	 * Default--> Keyword ( 2020 ) BACKWORD COMPATIBLITY --> if you are adding new
	 * func. previous one should not be affected this method become optional, not
	 * compulsory all the classes
	 */

	// OPTIONAL JAVA.8
	public default void autoUpgrade() { // to some of the classes // Default method : 1
		connecttoDB();
		System.out.println("Booking Upgraded");
	}

	public default void sendNotification() { // Default method : 1
		connecttoDB();
		System.out.println("Sending Notification");
	}

	// Common or utility method
	public static void printTicket(String path, String contents) {

		// 200 lines
		System.out.println("IBooking.printTicket...static method..");

	}

	// JAVA.9
	// Common or utility method
	private void connecttoDB() {
		System.out.println("Connected to DataBase");

	}

}
