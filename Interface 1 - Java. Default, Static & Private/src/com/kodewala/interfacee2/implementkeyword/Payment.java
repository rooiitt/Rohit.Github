package com.kodewala.interfacee2.implementkeyword;

public interface Payment {
	void pay(double ammount);

	public default void showTransactionStatus() {
		System.out.println("Payment.showTransactionStatus......");

	}

}
