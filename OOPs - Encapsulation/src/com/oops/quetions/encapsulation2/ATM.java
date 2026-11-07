package com.oops.quetions.encapsulation2;

public class ATM {
	private int pin;

	public void setPin(int pin) {
		if (pin >= 1000 && pin <= 9999) {

			this.pin = pin;
			System.out.println("PIN Accepted");
		} else {
			System.out.println("Invalid PIN");
		}

	}

	public static void main(String[] args) {
		 ATM a = new ATM();
		 
		 a.setPin(1234);
		 a.setPin(12125);
		 a.setPin(123);
		 
	}

}
//class BankAccountt {
//	private double balance = 5000;
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public static void main(String[] args) {
//		BankAccountt b = new BankAccountt();
//		System.out.println(b.getBalance());
//	}
//}
