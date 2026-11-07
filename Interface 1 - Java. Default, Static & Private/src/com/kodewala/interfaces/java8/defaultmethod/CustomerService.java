package com.kodewala.interfaces.java8.defaultmethod;

/*
 * Default method vs overloaded method
 */
public interface CustomerService {
	   default void displayCustomer() {
	        System.out.println("General customer");
	    }

	    default void displayCustomer(String customerName) {
	        System.out.println("Customer: " + customerName);
	    }
	}

	class PremiumCustomer implements CustomerService {
	    @Override
	    public void displayCustomer() {
	        System.out.println("Premium customer");
	    }
	}

class CustomerServiceDriver {
	    public static void main(String[] args) {
	        PremiumCustomer customer = new PremiumCustomer();

	        customer.displayCustomer(); // we haven't refer the CustomerService it will firstly call " Premium Customer"
	        customer.displayCustomer("Rohit"); // Second default Method
	    }
	}


