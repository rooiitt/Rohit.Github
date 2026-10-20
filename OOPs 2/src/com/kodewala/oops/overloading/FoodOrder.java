package com.kodewala.oops.overloading;

public class FoodOrder {
	public void placeOrder(String itemname) {
		System.out.println("FoodOrder.placeOrder( String item): " + itemname);
	}

	public void placeOrder(String itemname, int quantity) {
		System.out.println("FoodOrder.placeOrder()Nmae and quantit:  " + itemname + quantity);
	}

	public void placeOrder(String itemname, int quantity, String address) {
		System.out.println("FoodOrder.placeOrder( Nmae and quantity, Address): " + itemname +" , "+ quantity+" , " + address);
	}

	public static void main(String[] args) {
		FoodOrder f = new FoodOrder();
		f.placeOrder("paneer: ");
		f.placeOrder("paneer ", 20);
		f.placeOrder("paneer", 20, "BTM");

	}

}
