package com.kodewala.interfaces.java8.staticmethods;

public interface IDiscount {
	static double calculateFinalPrice(double price, double discountPercentage) {

		double discount = price * discountPercentage / 100; // Logic
		return price - discount;

	}

}

class Electronics implements IDiscount {

}

class Clothing implements IDiscount {

}

class Grocery implements IDiscount {

	public static void main(String[] args) {

		double eletronicPrice = IDiscount.calculateFinalPrice(500, 14);
		System.out.println(eletronicPrice);

		double clothing = IDiscount.calculateFinalPrice(300, 20);
		System.out.println(clothing);

		double glocery = IDiscount.calculateFinalPrice(200, 30);
		System.out.println(glocery);

	}

}
