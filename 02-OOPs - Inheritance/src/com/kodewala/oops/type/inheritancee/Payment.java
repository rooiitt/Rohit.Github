package com.kodewala.oops.type.inheritancee;

//Hierarchical Inheritance
public class Payment {
	public void pay() {
		System.out.println("Payment.pay()");
	}

}
class UPIPayment extends Payment{
	public void upiDetails(){
		System.out.println("UPIPayment.upiDetails()");
		
	}
}
class CardPayment extends Payment{
	public void cardDetails() {
		System.out.println("CardPayment.cardDetails()");
	}
}
class PayDriver{
	public static void main(String[] args) {
		UPIPayment u = new UPIPayment(); 
		u.pay(); // Inherited from Payment
		u.upiDetails(); // Own Method
		
		CardPayment c = new CardPayment();
		c.pay(); // Inherited from Payment
		c.cardDetails();// Own Method
		
	}
}
