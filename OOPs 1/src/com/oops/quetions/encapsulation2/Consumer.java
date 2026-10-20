package com.oops.quetions.encapsulation2;
//Electricity bill
public class Consumer {
	private int unitConsumed;

	public void setUnitConsumed(int unitConsumed) { // set method
		if(unitConsumed > 0 ) {
		this.unitConsumed = unitConsumed;
	}else {
		System.out.println("Invalid units:" );
	}
	}
		

	public int getUnitConsumed() {   // get method
		return unitConsumed;
	}
	public double calculateBill() {
		return unitConsumed * 5.8;  // Example rate Rupee 5 per unit
	}
	public static void main(String[] args) {
		Consumer c = new Consumer();
		
		c.setUnitConsumed(100);
		System.out.println("Unit Consumed: " + c.getUnitConsumed());
		System.out.println("Electricity Bill: " + c.calculateBill());
	}
}
