package com.kodewala.oops.inheritancee3;

public class UserDriver {
	public static void main(String[] args) {
//		IS-A Method
		Customer c = new Customer();
		
		ShoppingCart s = new ShoppingCart(c);
		
		s.checkout();
	}
}
		

