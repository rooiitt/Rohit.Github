package com.kodewala.oops.inheritancee3;

//Payment Gateway 
public class Transiction {
	public void processPayment() {
		System.out.println("Processing Payment");
	}

}
class WalletTransiction extends Transiction{
	@Override
	public void processPayment() {
		System.out.println("Payment throgh Wallet");
	}
	
	public void checkWalletBalance() {
		System.out.println("Checking wallet Balance"); // --> Additional Method thats how we write 
	}
}
class BankTransiction extends Transiction {
	@Override
	public  void processPayment() {
		System.out.println("Payment throgh Bank");
	}
}
class TransDriver{
	public static void main(String[] args) {
		WalletTransiction w = new WalletTransiction();
		w.processPayment();
		w.checkWalletBalance();
		
		BankTransiction b = new BankTransiction();
		b.processPayment();
	}
}