package com.product;

public class Driver {

	public static void main(String[] args) {
		
		Product obj = new Product( "Device" , 20000.0 , "Good quality camera", 10);
		System.out.println(obj.productName +" "+ obj.price +" "+ obj.description +" "+ obj.quantity);
		
		Product obj1 = new Product("Device" , "Good quality camera");
		System.out.println(obj1.productName +" "+ obj.description);
		
		Product obj3 = new Product();
		System.out.println(obj3.price + "  " + obj3.description);
		 

	}
	
	
}