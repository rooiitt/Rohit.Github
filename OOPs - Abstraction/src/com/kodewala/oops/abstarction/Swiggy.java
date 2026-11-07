package com.kodewala.oops.abstarction;

public class Swiggy {
	public boolean placeOrder(String name, String address, String orderId) {

		customerNameAndAddress(name, address); // Now you can apply any fixes in the future. 
		orderId(orderId);
		connectDatabase();
		createUserId();

//		System.out.println("Swiggy.placeOrder()");````````
		return true;
	}

    //Core Functionalities
	private boolean customerNameAndAddress(String name, String address) {
		System.out.println("Swiggy.customerNameAndAddress() Name and Address" + " , "+ name + " , " +address);
		return true;
	}

	// Core Functionalities
	private boolean orderId(String orderId) {
		System.out.println("Swiggy.orderId()...OrderID" + " , "+ orderId);
		return true;
	}
    
	// Core Functionalities
	private void connectDatabase() {
		System.out.println("Swiggy Connected to Database");

	}

	// Core Functionalities
	private String createUserId() {
		System.out.println("Swiggy.createUserId : Created UserId");
		return "User Id";
	}

}
