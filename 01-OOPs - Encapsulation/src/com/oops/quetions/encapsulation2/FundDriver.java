package com.oops.quetions.encapsulation2;

public class FundDriver {
	public static void main(String[] args) {
		FundTransfer f = new FundTransfer("Manasvii", "543212345",5000.0, 400);
		f.withdrawal(600); // withdraw from current account balance 
		f.amountAdded();
		System.out.println("Ammount Added : " + f.amountAdded());
		
	}

}
