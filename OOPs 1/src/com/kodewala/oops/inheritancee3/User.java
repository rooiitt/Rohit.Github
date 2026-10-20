package com.kodewala.oops.inheritancee3;

public class User 
{
	public void login() {
		
		System.out.println("User login succesful");
		}

}
class Customer extends User{
	public void shop() {
		System.out.println("Customer is shoping ");
	}
	
}
class ShoppingCart{
	
	Customer customer;
	// Constructors
	public ShoppingCart( Customer customer) {
		this.customer = customer;
		
	}
	
	public void checkout() {
		customer.login();
		customer.shop();
		System.out.println("Checkout successfull");
	}

}
