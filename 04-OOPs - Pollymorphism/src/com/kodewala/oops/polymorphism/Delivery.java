package com.kodewala.oops.polymorphism;

public class Delivery {
	public void deliveryOrder() {
		System.out.println("Delivery.deliveryOrder().....Delivery Order");
	}

}

class BikeDivery extends Delivery {
	@Override
	public void deliveryOrder() {
		System.out.println("BikeDivery.deliveryOrder()......By Bike Delivery");
	}
}

class DroneDelivery extends Delivery {
	@Override
	public void deliveryOrder() {
		System.out.println("DroneDelivery.deliveryOrder().....By Drone Delivery");
	}
}

class TruckDelivery extends Delivery {
	@Override
	public void deliveryOrder() {
		System.out.println("TruckDelivery.deliveryOrder().......By Truck Delivery");
	}
	public static void main(String[] args) {
		//By Bike
		Delivery d = new BikeDivery();
		d.deliveryOrder();
		
		// By Drone 
		Delivery d1 = new DroneDelivery();
		d1.deliveryOrder();
		
		//By Truck
		Delivery d2 = new DroneDelivery();
		d2.deliveryOrder();
		
	}
}
