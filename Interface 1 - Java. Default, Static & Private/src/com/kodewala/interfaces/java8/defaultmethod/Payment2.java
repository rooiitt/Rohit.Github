package com.kodewala.interfaces.java8.defaultmethod;

public interface Payment2 {
	    default void processPaymentt() {
	        System.out.println("General payment processing");
	    }
	}

	interface SecurePayment extends Payment {
	    default void processPaymentt() {
	        System.out.println("Secure payment processing");
	    }
	}

	class OnlinePayment implements SecurePayment {
	}

class Main {
	    public static void main(String[] args) {
	        OnlinePayment payment = new OnlinePayment();
	        payment.processPaymentt();
	    }
	}


