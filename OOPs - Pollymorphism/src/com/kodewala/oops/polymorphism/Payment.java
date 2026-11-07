package com.kodewala.oops.polymorphism;

public class Payment {
	public void pay() {
		System.out.println("Payment.pay()......Payment Loading...");
	}

}

class UPIPayment extends Payment {
	@Override
	public void pay() {
		System.out.println("UPIPayment.pay().....UPI Payment");
	}

	public void scanQR() {
		System.out.println("UPIPayment.scanQR()........ScanQR");
	}

}

class CardPayment extends Payment {
	@Override
	public void pay() {
		System.out.println("CardPayment.pay()......Card Payment");
	}

	public static void main(String[] args) {
        //Up-casting 
		Payment p = new UPIPayment();
		p.pay();
		
		// Down-Casting
		/*
		 * Downcast the parent reference to UPIPayment and call scanQR()!!
		 */
		UPIPayment u = (UPIPayment) p;
		u.scanQR();
		
		//Upcasting with CardPayment
		Payment p2 = new CardPayment();
		p2.pay();

	}

}