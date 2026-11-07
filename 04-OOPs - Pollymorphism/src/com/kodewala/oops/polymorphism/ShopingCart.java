package com.kodewala.oops.polymorphism;

/*
 * Method Overloading
 */
public class ShopingCart {
	public void addItem(String itemNmae) {
		System.out.println("ShopingCart.addItem()...ShopingCart Added");

	}

	public void addItem(String itemNmae, int quantity) {
		System.out.println("ShopingCart.addItem().......ItemName and Quantity");

	}

	public void addItem(String itemNmae, int quantity, double price) {
		System.out.println("ShopingCart.addItem()......ItemName and Quantity and Price" + " , " + itemNmae + " , " + quantity
				+ " , " + price);

	}

	public static void main(String[] args) {
		ShopingCart s = new ShopingCart();
		s.addItem("Mac", 1, 50000);
	}

}
