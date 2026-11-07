package com.kodewala.oops.polymorphism;

public class Order {
	public void processOrder() {
		System.out.println("Order.processOrder().....Order Processing");
	}

}

class OnlineOrder extends Order {
	@Override
	public void processOrder() {
		System.out.println("OnlineOrder.processOrder().......Online Order");
	}

	public void trackDelivery() {
		System.out.println("OnlineOrder.trackDelivery().....Truck Delivery");
	}
}

class StoreOrder extends OnlineOrder {
	@Override
	public void processOrder() {
		System.out.println("StoreOrder.processOrder()....Store Order");
	}

	public void printReceipt() {
		System.out.println("StoreOrder.printReceipt().....Print Receipt");
	}

	public static void main(String[] args) {
		/*
		 * Down-casting changes the 
		 * reference type, not the actual object type.
		 */
		Order o = new StoreOrder();
		o.processOrder();
		
		OnlineOrder n = (OnlineOrder) o; //?? there is no object created how the method is Executing.
		n.trackDelivery();
		
		StoreOrder s = (StoreOrder) o;
		s.printReceipt();
	}
}