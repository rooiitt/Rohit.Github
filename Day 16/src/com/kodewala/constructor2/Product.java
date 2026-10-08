package com.kodewala.constructor2;

public class Product {
	
	String name;
	String price;
	String productID;
	
	public Product(String name , String price , String productID )
	{
		this.name = name;
		this.price = price;
		this.productID = productID;
	}
    
	public void display()
	{
		System.out.println("Item name : " + name);
		System.out.println("Item Price : " + price);
		System.out.println("Item Product ID : " + productID);
		System.out.println(".............................................");
	}
}
