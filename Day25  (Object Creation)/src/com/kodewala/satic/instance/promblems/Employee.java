package com.kodewala.satic.instance.promblems;

public class Employee { // This will execute whenever the object is created
	{
		System.out.println("Instance Block");
	}

}
class DriEmployee{
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee(); 
	}
	
	
}
