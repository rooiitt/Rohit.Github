package com.kodewala.oops.abstarction1;

//public class SmartDriver {
//
//	// For SmartLight
//	public static void main(String[] args) {
//		SmartDevice s = new SmartLight();
//		s.turnOn();
//		s.turnOff();
//
//		// For SmartFan
//		SmartDevice s1 = new SmartLight();
//		s1.turnOn();
//		s1.turnOff();
//
//		// For SmartFan
//		SmartDevice s2= new SmartFan();
//		s2.turnOn();
//		s2.turnOff();
//
//		// For AirConditioner
//		SmartDevice s3 = new AirConditioner();
//		s3.turnOn();
//		s3.turnOff();
//	}
//
//}

public class SmartDriver1 {

	public static void main(String[] args) {

		SmartDevice[] devices = { new SmartLight(), new SmartFan(), new AirConditioner() };

		for (int i = 0; i < devices.length; i++) {
			devices[i].turnOn();
			devices[i].turnOff();
		}
	}
}
