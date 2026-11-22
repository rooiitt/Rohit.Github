package com.kodewala.constructorchaining01;

public class Driver {

	public static void main(String[] args) {
		
		ElectronicProduct obj = new ElectronicProduct ("Iphone", "300000" , "D14", 2);
		obj.display();
		
		ElectronicProduct obj1 = new ElectronicProduct ("Iphone13", "400000" , "D15" , 2);
		obj1.display();
		
	}

}
