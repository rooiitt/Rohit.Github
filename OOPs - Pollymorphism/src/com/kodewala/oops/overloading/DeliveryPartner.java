package com.kodewala.oops.overloading;

public class DeliveryPartner {
	public void calculateDeliveryFee() {
		System.out.println("Calculating Delivery Fee");
	}

}
class BikeParter extends DeliveryPartner{
	@Override
	public void calculateDeliveryFee() {
		System.out.println("BikeParter Delivery Fee ");
		
	}
}
class TruckParter extends DeliveryPartner{
	@Override
	public void calculateDeliveryFee() {
		System.out.println("TruckParter Delivery Fee");
	}
	
//	demonstrate runtime POLYMORPHISM!!
	public static void main(String[] args) {
		DeliveryPartner d = new BikeParter();
		d.calculateDeliveryFee();
		d = new TruckParter(); // Reassign d to a new child object
		d.calculateDeliveryFee();
	}
	
}
