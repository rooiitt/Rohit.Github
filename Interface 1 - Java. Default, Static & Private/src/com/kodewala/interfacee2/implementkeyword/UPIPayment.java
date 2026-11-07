package com.kodewala.interfacee2.implementkeyword;

public class UPIPayment implements Payment {

	@Override
	public void pay(double ammount) {
		System.out.println("UPIPayment.pay()" + " " + ammount);

	}

}
