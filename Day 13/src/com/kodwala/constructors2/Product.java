package com.kodwala.constructors2;

public class Product {
	String name;
	int price;
	String adress;
	


	public Product(String name, int price, String adress) {
		super();
		this.name = name;
		this.price = price;
		this.adress = adress;
	}



	public void display() 
	{
		System.out.println(" Product Name : " + name);
		System.out.println(" Product Price : " + price);
		System.out.println(" Product Address : " + adress);
		
	}

}
