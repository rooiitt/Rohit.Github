package com.kodewala.interfaces.java8.staticmethods;

/*
 * Static = Interface ka method. 
 * Abstract = Implementing class ka method.
 */
public interface IPayment {
	static boolean validateAmount(double amount) {
		return amount > 0;
	}

}

class UpiPayment implements IPayment {

}

class CardPayment implements IPayment {

}

class NetBankingPayment implements IPayment {

}

class DriverPaymnet {
	public static void main(String[] args) {

		boolean upipaymnet = IPayment.validateAmount(3000);
		System.out.println(upipaymnet);

		boolean cardpaymnet = IPayment.validateAmount(-300);
		System.out.println(cardpaymnet);

		boolean netbanking = IPayment.validateAmount(2000);
		System.out.println(netbanking);
	}

}
