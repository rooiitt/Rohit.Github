package com.kodewala.control.flow1;

public class Ecomerce {

	    static void calculateDiscount(String customerType, double amount) {
		double discount = 0;
		if (customerType.equals("Gold")) {
			discount = amount * 20.0 / 100;
		} else if (customerType.equals("Silver")) {
			discount = amount * 10.0 / 100;
		} else if (customerType.equals("Bronze")) {
			discount = amount * 5.0 / 100;
		} else {
			discount = 0;
		}
		System.out.println("Discpint: " + discount);

	}
 public static void main(String[] args) {
	 calculateDiscount("Gold" , 600);
	 calculateDiscount("Silver" , 600);
	 calculateDiscount("Bronze" , 600);
	 
	
}
}
