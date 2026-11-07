package com.oops.quetions.encapsulation2;

public class DriverAvailablity {
	public static void main(String[] args) {
		DriverProfile d = new DriverProfile("Anudeep", true);
		RideBooking r = new RideBooking(d);
		
		r.assignRide();
		r.assignRide();
		
	}

}
