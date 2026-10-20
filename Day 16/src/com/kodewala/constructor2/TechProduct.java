package com.kodewala.constructor2;

public class TechProduct extends Product {
	
	int warranty;
	
	public TechProduct(String name , String price , String productID, int warranty ) 
	{
		super (name, price, productID);
		this.warranty = warranty;
		
	}
	
}
	
	
	


