package com.product;

public class Product {

	String productName;
	double price;
	String description;
	int quantity;

	Product(String productName, double price, String description, int quantity) {

		this.productName = productName;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}
	
	Product(String productName , String description ) {
		System.out.println("Product with name and discription");
		
		this.productName = productName;
		this.description = description;
	}
		Product() {
	
		
	}
		
}
	
		
	
		
	
	
		
		
	
	


