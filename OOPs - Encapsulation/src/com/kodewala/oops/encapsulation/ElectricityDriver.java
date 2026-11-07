package com.kodewala.oops.encapsulation;

public class ElectricityDriver {
	public static void main(String[] args) {
		ElectricityBill e = new ElectricityBill();
		e.setUnitConsumed(12);
		System.out.println("Units are Consumed : " + e.getUnitConsumed());
		
		System.out.println("Bill Clculate: " + e.calculateBill());
	}

}
