package com.kodewala.oops.inheritancee3;

public class PersonDriver {
	
	public static void main(String[] args) {
		// IS-A relationship
		Employee e = new Employee();
		e.openAccount("RR123", "Rohit");
		
		
		// HAS-A relationship
		Person c = new Person();
		c.employee = new Employee();
		c.employee.openAccount("RR123", "Rohit");
	}

}
