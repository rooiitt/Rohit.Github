package com.kodewala.oops.inheritance2;

public class ProducDriver {

	public static void main(String[] args) {
		Product p = new Product("Iphone15" , "This is iphone" , 15 , "In-Stock");
		p.viewProductDetails();
		
		ElectronicProduct e = new ElectronicProduct("Macbook", "This is Macbook", 1, "In-Stock", true, 2);
		e.viewElectronicProductDetails();
		
		Clothing c = new Clothing("Shirt", "This is cloth brand", 2, "In-Stock", true, 1, "Locomovtive", 500);
		c.myClothing();


	}

}
