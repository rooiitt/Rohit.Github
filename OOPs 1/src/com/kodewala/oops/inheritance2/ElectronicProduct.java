package com.kodewala.oops.inheritance2;

public class ElectronicProduct extends Product {
	boolean isWarrany;
	int warrantyInYears;

	public ElectronicProduct(String productName, String description, int quantity, String status, boolean isWarrany,
			int warrantyInYears) {
		super(productName, description, quantity, status);
		this.isWarrany = isWarrany;
		this.warrantyInYears = warrantyInYears;
	}
	
	public void viewElectronicProductDetails()
	{
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		
		System.out.println(isWarrany);
		System.out.println(warrantyInYears);
	}

}
