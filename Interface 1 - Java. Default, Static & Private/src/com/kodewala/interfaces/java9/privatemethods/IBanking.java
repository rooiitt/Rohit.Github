package com.kodewala.interfaces.java9.privatemethods;

public interface IBanking {
	default void deposite() {
		accountValidation();
		System.out.println("Bank Deposit");
	}

	default void withdrow() {
		accountValidation();
		System.out.println("Bank Withdrow");
	}

	default void transfer() {
		accountValidation();
		System.out.println("Bank Transfer");
	}

	private void accountValidation() {
		System.out.println("Account Validation");
	}

}
