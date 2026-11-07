package com.interfacetype.cloning;

public class Employee implements Cloneable { // Level 1
	String name; // copied
	String empCode; // copied
	Address address; // HAS-A // copy only the reference not the object. 
	                // n' this object will be common between the Original object , cloned object

	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.address = (Address) address.clone();
		return  e;
	}
}
