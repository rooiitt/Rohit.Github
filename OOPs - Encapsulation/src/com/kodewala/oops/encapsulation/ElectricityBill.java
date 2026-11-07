package com.kodewala.oops.encapsulation;

public class ElectricityBill {
	private int unitConsumed;
	

	public void setUnitConsumed(int units) {
		if(units >= 0 ) {
			this.unitConsumed = units;
			System.out.println("Units are Consumed");
		} else {
			System.out.println("Negative units are rejected");
		}
		
	}

	public int getUnitConsumed() {
		return unitConsumed;
	}
	public double calculateBill() {
		return unitConsumed * 5.0;
	}

}
