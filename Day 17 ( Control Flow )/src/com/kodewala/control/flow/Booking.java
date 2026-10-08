package com.kodewala.control.flow;

public class Booking {
	//More than 6 pax is not allowed.
	public String doBooking (String from , String to , int noOfPax ) {
		String pnr = null;
		if(noOfPax > 6) // if true then only below code gets executed.
		{   // Do not allow to book
			System.out.println("As per IRCTC policy, only 6 pax are allowed per PNR");
		} else {
			// Conforming the Booking 
			pnr = "8174681764817";
			System.out.println("conforming the booking : " + pnr);
			System.out.println("Statu : CONFORMED");
			System.out.println("SEAT : 34 A");
		}
		
		// .... 
		// ....
		return pnr;
			
	}

}
