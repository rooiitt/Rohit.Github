package com.kodewala.oops.abstarction1;

abstract class Payment {
	abstract void makePaymnet();
	

}

class UPIPayment extends Payment {

	@Override
	void makePaymnet() {
		System.out.println("UPIPayment.makePaymnet(......UPIPayment)");

	}

}
class CardPayment extends Payment{

	@Override
	void makePaymnet() {
		System.out.println("CardPayment.makePaymnet()....CardPayment");
		
	}
	
}
class NetBankingPayment extends Payment{

	@Override
	void makePaymnet() {
		System.out.println("NetBankingPayment.makePaymnet().....NetBankingPayment");
		
	}
	public static void main(String[] args) {
		Payment p = new CardPayment(); // In run time the CardPayment object will run
		p.makePaymnet();
		
		Payment p1 = new NetBankingPayment(); // In run time the NetBankingPayment object will run
		p1.makePaymnet();
	}
	
}