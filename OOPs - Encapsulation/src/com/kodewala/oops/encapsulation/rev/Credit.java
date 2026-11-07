package com.kodewala.oops.encapsulation.rev;

public class Credit {
	public void credit() {
		checkBalance();
		validatePin("ryr");
		
	}
	
	private int checkBalance() {
		System.out.println("Credit.checkBalance()....Chcek Balance ");
		return 3000;
	}
	private boolean validatePin(String userID) {
		System.out.println("Credit.validatePin()...Validate PIN");
		return true;
		
	}
	public static void main(String[] args) {
		Credit c = new Credit();
		c.credit();
	}
	

}
