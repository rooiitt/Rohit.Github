package com.oops.quetions.encapsulation2;
//Shopping cart
public class ShopingCart {
	private double totalAmount;

	public void addItem(double price) {
		if (price > 0) {
			this.totalAmount = this.totalAmount + price;
			System.out.println(" Accept Positive Price :" + price);
		} else {
			System.out.println("Invalid Price: " + price);
		}
	}

	double getTotal() {
		return totalAmount;

	}
	public static void main(String[] args) {
		ShopingCart s = new ShopingCart();
		
		s.addItem(200);
		s.addItem(-250);
		
		System.out.println("Total Amount: " + s.getTotal());
	}

}
