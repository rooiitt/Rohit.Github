package com.kodewala.interfacetype.markerinterface;
/*
 * Clone --> cloning is one of the critical activity --> before performing cloning need to take permission from the class or account class 
 * 
 * How  do we give permission? --> with the help of Marker interface
 * The purpose of Marker Interface will give permission so that JVM can perform the activity
 */

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {

		Account acc = new Account("Kodewala Acadamey", "BTM Banglore", "798174814141");

		Account cloneObjcetAcc = (Account) acc.clone(); // Trying to clone (xerox / copy)
		System.out.println(cloneObjcetAcc.accNo);

		if (acc instanceof Cloneable) 
		{
			System.out.println("true");
		} else 
		{
			System.out.println("false");
		}
	}

}
