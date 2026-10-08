package com.kodewala.constructor;

public class ElectronicProduct extends Product { 
	
	int warranty;

	public ElectronicProduct(String name, String price, String productID) {
		
		super (name, price, productID);
		this.warranty = warranty; 
	}
	public void display()
	{
		System.out.println("Item Nmae : " + name);
		System.out.println("Price :" + price);
		System.out.println("Product Id : "+ productID);
		System.out.println("....................................................");
	}
}
