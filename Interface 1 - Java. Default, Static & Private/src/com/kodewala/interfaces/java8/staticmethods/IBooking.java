package com.kodewala.interfaces.java8.staticmethods;

public interface IBooking {
	static String acceptBooking(String bookingType , int bookingID) {
		String formate = bookingType + "-" + bookingID; // Logic 
		return formate;
		
	}  
	public static void main(String[] args) {
		System.out.println(IBooking.acceptBooking("FLIGHT", 101));
		System.out.println(IBooking.acceptBooking("HOTEL", 102));
		System.out.println(IBooking.acceptBooking("BUS", 103));
	}

}
