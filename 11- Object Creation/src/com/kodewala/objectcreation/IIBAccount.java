package com.kodewala.objects;

class AccountMngm {

	public AccountMngm() {
		System.out.println("AccountMngm.main()");
	}
}

class Account extends AccountMngm {

	static {
		System.out.println("Account.SIB");
	}

	String accountNumber;

	public Account(String accountNumber) {
		super(); // (First line should be this () or super () )
		// call to Init block --> IIB --- 2nd line
		System.out.println("Account(String accountNumber");
		this.accountNumber = accountNumber;

	}

	// Instance Initi blook --> this will get executed whenever Object is Created
	{
		System.out.println("Account.IIB()");
	}
}
