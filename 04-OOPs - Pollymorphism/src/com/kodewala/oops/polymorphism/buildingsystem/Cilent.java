package com.kodewala.oops.polymorphism.buildingsystem;

//Driver class
public class Cilent {
	public static void main(String[] args) {
		PaymentProcesser p = new PaymentProcesser();

		// for the user 1 he selected payment method as Credit Cart

		CreditCartPayment c = new CreditCartPayment();

		p.processPayment(c); // calling it through the processPayment [ where we created payment method.]

		// for the user2 he Selected Payment Method as NetBanking

		NetBanlkingPayment n = new NetBanlkingPayment();
		p.processPayment(n);

		// For the user 3 he Selected Payment Method as a UPI Payment

		UPIPayment u = new UPIPayment();
		p.processPayment(u);

		// For the user 4 he Selected Payment Method as a EMI Payment

		EMIPaymnet e = new EMIPaymnet();
		p.processPayment(e);

	}

}
