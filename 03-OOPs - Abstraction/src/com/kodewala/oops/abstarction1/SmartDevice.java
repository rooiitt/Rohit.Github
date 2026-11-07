package com.kodewala.oops.abstarction1;

abstract class SmartDevice {
	abstract void turnOn();

	abstract void turnOff();

}

class SmartLight extends SmartDevice {

	@Override
	void turnOn() {
		System.out.println("SmartLight.turnOn().....SmartLight On");

	}

	@Override
	void turnOff() {
		System.out.println("SmartLight.turnOff()........SmartLight Off");

	}

}
class SmartFan extends SmartDevice{

	@Override
	void turnOn() {
		System.out.println("SmartFan.turnOn()........SmartFan On");
		
	}

	@Override
	void turnOff() {
		System.out.println("SmartFan.turnOff()........SmartFan Off");
		
	}
	
}
class AirConditioner extends SmartDevice{

	@Override
	void turnOn() {
		System.out.println("AirConditioner.turnOn()........AirConditioner On");
		
	}

	@Override
	void turnOff() {
		System.out.println("AirConditioner.turnOff(..........AirConditioner Off");
		
	}
	
}