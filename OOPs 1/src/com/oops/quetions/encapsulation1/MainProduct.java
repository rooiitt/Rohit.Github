package com.oops.quetions.encapsulation1;

public class MainProduct {

	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product();

		p1.setPrice(82.0);
		p2.setPrice(63.0);
		
		System.out.println("Product 1 Price: " + p1.getPrice());
		System.out.println("Product 2 Price: " + p2.getPrice());

	}

}
