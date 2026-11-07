package com.kodewala.interfaces.java9.privatemethods;

public interface IPaymnet {
	default void processPaymnet() {
		validateSecurity();
		System.out.println("Payment Processing ");
	}

	default void refundPaymnet() {
		validateSecurity();
		System.out.println("Refund Paymnet");
	}

	private void validateSecurity() {
		System.out.println("Validate Security");
	}

}
class UPIPaymnet implements IPaymnet{ // will not directly call the private method 
	
}
class IPaymentDriver{
	public static void main(String[] args) {
		
		UPIPaymnet upi = new UPIPaymnet();
		
		upi.processPaymnet();
		upi.refundPaymnet();
		
//		upi.validateSecurity(); --> Compiler error 
	}
}