package com.oops.quetions.encapsulation2;

public class Product {
	private double discount;

	public void setDiscount(double discount) {
		if (discount > 0 && discount < 50 ) {
			this.discount = discount;
		System.out.println("Accepted Discount ");
	}else {
		System.out.println("Invalid discount");
	}
	}

	public double getDiscount() {
		return discount;
	}

	public static void main(String[] args) {
		Product p = new Product();
		p.setDiscount(25);
		System.out.println(p.getDiscount());

	}

}
