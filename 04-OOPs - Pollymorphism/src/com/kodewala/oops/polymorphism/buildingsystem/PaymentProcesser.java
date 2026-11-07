package com.kodewala.oops.polymorphism.buildingsystem;
/*
 * here we created the method payment which is helping out to call class execution.
 * Pollymorphism
 */

public class PaymentProcesser {
	public void processPayment(Payment payment) // can accept any type of payment (Credit , NetBanking , UPIet ) Object
	{
		payment.dopayment(); // Ploymorphism // Payment payment = new NetbankingPayment();
	}
}
		
	