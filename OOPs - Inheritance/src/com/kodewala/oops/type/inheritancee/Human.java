package com.kodewala.oops.type.inheritancee;

/*
 * There are 4 Type of Inheritance 
 * 
 *  1. Single A --> B 
 *  2. Multilevel A --> B ---> C
 *  3. Hierarchical A --> B AND A --> C
 *  4. Multiple A + B --> C 
 *  
 *  */

public class Human {  // --->  Single Inheritance
	public void displayPerson() {
		System.out.println("Person Said Hii");
	}

}
class Doctor extends Human {
	public void treatPatient() {
		System.out.println("Doctor Said Hii");
	}
}
class Mian{
	public static void main(String[] args) {
		
		Doctor d = new Doctor();
		d.treatPatient();
		d.displayPerson();
		
	}
}
