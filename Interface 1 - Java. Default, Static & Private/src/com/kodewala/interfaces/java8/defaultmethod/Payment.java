package com.kodewala.interfaces.java8.defaultmethod;
/* JAVA 8 ( Default Keyword )
 * 
 * --> A default method has a method body inside an interface.
 * 
 * --> An implementing class inherits the default method and 
 * can override it.
 * 
 * --> Default methods help add new methods to existing interfaces without forcing 
 * every existing implementing class to implement them.
 */

public interface Payment {
	default void printRecipt() {
		System.out.println("Payment Recipt");
	}

}

class UPIPayment implements Payment {

}

class PaymentDriver {
	public static void main(String[] args) { 
		UPIPayment u = new UPIPayment();
		u.printRecipt();
	}
}