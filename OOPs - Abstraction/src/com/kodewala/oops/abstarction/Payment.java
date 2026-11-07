package com.kodewala.oops.abstarction;

public class Payment {
	public void makePayment(){
		System.out.println("Payment.makePayment()");
	}

}
class UPIPayment extends Payment{
	@Override
	public void makePayment() {
		System.out.println("USI payment initiated");
		System.out.println("Bank server validating transaction");
		System.out.println("Payment successful");
	}
	public static void main(String[] args) {
		Payment p = new UPIPayment();
		p.makePayment();
	}
}
