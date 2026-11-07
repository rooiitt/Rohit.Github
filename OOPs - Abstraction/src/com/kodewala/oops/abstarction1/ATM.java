package com.kodewala.oops.abstarction1;

abstract class ATM {
	abstract void withdraw();

}
class BankATM extends ATM {
	 void withdraw() {
		System.out.println("BankATM.withdraw()....Bank Withdraw");
	}
	 public static void main(String[] args) {
		 ATM a = new BankATM(); 
		 a.withdraw();
	}
}
