package com.kodewala.oops.inheritance2;

public class Clothing extends ElectronicProduct {
	String clothingBrand;
	int minimumCost;

	public Clothing(String productName, String description, int quantity, String status, boolean isWarrany,
			int warrantyInYears, String clothingBrand, int minimumCost) {
		super(productName, description, quantity, status, isWarrany, warrantyInYears);
		this.clothingBrand = clothingBrand;
		this.minimumCost = minimumCost;
	}

	public void myClothing() {

		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);

		System.out.println(isWarrany);
		System.out.println(warrantyInYears);

		System.out.println(clothingBrand);
		System.out.println(minimumCost);
	}
}
