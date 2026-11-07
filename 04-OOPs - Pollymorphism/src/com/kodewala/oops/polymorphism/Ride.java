package com.kodewala.oops.polymorphism;

public class Ride {
	public void calculateFare() {
		System.out.println("Ride.calculateFare().....Ride CalculateFare");
	}

}

class BikeRide extends Ride {
	public void calculateFare() {
		System.out.println("BikeRide.calculateFare()....Bike Ride");
	}
}

class CarRide extends Ride {
	public void calculateFare() {
		System.out.println("CarRide.calculateFare(.....Car Ride)");
	}
}

class LuxuryRide extends Ride {
	public void calculateFare() {
		System.out.println("LuxuryRide.calculateFare()....Luxury Ride");
	}
	public static void main(String[] args) {
//		For Bike
		Ride r = new BikeRide();
		r.calculateFare();
		
//		ForCar
		Ride r1 = new CarRide();
		r1.calculateFare();
		
//		LuxuryRide
		Ride r2 = new LuxuryRide();
		r2.calculateFare();
		
	}
}
