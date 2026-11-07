package com.kodewala.interfaces.java8.defaultmethod;

public interface DeviceService {
	  default void printDevice() {
	        System.out.println(this.getClass().getSimpleName());
	    }
	}

	class SmartWatch implements DeviceService {
	}

class DeviceServiceDriver {
	    public static void main(String[] args) {
	        DeviceService device = new SmartWatch();
	        device.printDevice();
	    }
	}


