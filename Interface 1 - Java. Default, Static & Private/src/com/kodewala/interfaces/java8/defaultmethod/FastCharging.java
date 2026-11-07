package com.kodewala.interfaces.java8.defaultmethod;

interface FastCharging { // Interface 1 with Default Method 
	default void charge() {
		System.out.println("FastCharging");
	}

}
interface WirelessCharging{ // Interface 2 with Default Method 
	default void wirelessCharge() {
		System.out.println("WirelessCharging");
	}
}
class Smartphone implements FastCharging , WirelessCharging {
	
}
class ChargingDriver{
	public static void main(String[] args) {
		Smartphone s = new Smartphone(); // in the Multi-interface we cannot keep the same method name it will create Conflict
		s.charge();
		s.wirelessCharge();
	}
	
}