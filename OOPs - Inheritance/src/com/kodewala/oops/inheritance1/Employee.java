package com.kodewala.oops.inheritance1;

class Employee {

	String name = "Amit ";
	String address = "Bangalore";
	
//	private String empCode = " ICT43864"
	public void markIn(String empId)
	{
		
	}
}
class Manager extends Employee{
	public void dosomthing()
	{
		System.out.println(name);
		System.out.println(address);
//		System.out.println(empCode);
		markIn(address);
	}
}
