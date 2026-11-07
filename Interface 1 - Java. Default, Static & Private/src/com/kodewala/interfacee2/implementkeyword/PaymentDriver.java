package com.kodewala.interfacee2.implementkeyword;

public class PaymentDriver {
	public static void main(String[] args) {
		Payment playment = new UPIPayment();
		playment.pay(200);
		playment.showTransactionStatus();
		
		
	}

}
