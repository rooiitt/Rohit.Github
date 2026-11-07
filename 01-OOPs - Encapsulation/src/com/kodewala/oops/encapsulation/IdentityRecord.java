package com.kodewala.oops.encapsulation;

public class IdentityRecord {
	private final int identityNumber;

	public IdentityRecord(int number) {
		this.identityNumber = number;
	}

	public int getIdentityNumber() {
		return identityNumber;
	}

}
class IdentityDriver{
	public static void main(String[] args) {
		IdentityRecord i = new IdentityRecord(4321);
		
		System.out.println(i.getIdentityNumber());
		
	}
}