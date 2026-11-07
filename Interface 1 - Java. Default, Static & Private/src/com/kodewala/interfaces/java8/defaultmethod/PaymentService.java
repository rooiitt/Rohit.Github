package com.kodewala.interfaces.java8.defaultmethod;

public interface PaymentService {
	void pay(double amount);  //--> Abstract Method 
	
	default void showPaymentStatus() { //--> Default keyword.
		System.out.println("Payment Status");
	}

}
class CreditCardPyamnet implements PaymentService{

	@Override
	public void pay(double amount) {
		System.out.println("CreditCardPyamnet.pay()" +" "+ amount);
		
	}
	public static void main(String[] args) {
		
		PaymentService payment = new CreditCardPyamnet();
		payment.pay(200);
		payment.showPaymentStatus(); // Default keyword.
	}
	
}
