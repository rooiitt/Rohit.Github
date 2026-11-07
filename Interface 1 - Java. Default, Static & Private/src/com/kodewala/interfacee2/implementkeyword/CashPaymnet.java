package com.kodewala.interfacee2.implementkeyword;

public class CashPaymnet implements Payment{

	@Override
	public void pay(double ammount) {
		System.out.println("CashPaymnet.pay()" +" "+ ammount);
		
	}

}
