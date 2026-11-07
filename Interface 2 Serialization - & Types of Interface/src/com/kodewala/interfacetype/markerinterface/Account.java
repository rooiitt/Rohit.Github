package com.kodewala.interfacetype.markerinterface;
/*
 * Cloneable - give permission to JVM to allow  to perform special activity :- Cloning and Serialization
 */
public class Account implements Cloneable {  // Giving permission so that object of this class can be copy or clone  

	String name;
	String address;
	String accNo;

	public Account(String name, String address, String accNo) {
		super();
		this.name = name;
		this.address = address;
		this.accNo = accNo;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
