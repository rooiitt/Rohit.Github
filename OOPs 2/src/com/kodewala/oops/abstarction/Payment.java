package com.kodewala.oops.abstarction;

public class Payment {
	public void makePayment(){
		System.out.println("Payment.makePayment()");
	}

}
class UPIPayment{
	private void makePayment() {
		System.out.println("UPIPayment.makePayment()");
	}
}
