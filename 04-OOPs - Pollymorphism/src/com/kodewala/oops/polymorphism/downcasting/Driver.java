package com.kodewala.oops.polymorphism.downcasting;

public class Driver {
	public void doDelivery() {
		System.out.println("Driver.doDelivery()...Driver");
	}

}

class ExpressBee extends Driver {
	public void doDelivery() {
		System.out.println("ExpressBee.doDelivery()...ExpressBee");
	}
}

class Ekard extends Driver {
	public void doDelivery() {
		System.out.println("Ekard.doDelivery(....Ekard)");
	}

	public static void main(String[] args) {
		/*
		 * Compile time --> it will check the method i Delivery Class Run time --> it
		 * will call the method of Express class.
		 */
		Driver d = new Driver(); // Calling the parent class method
		d.doDelivery();

		Driver d1 = new ExpressBee(); // Up-Casting

		d1.doDelivery();

		ExpressBee ex = (ExpressBee) d1; // calling from the parent refrance. --> Down-Casting
		ex.doDelivery();
	}

}
