package com.kodewala.oops.inheritancee3;

public class Person {
	public void openAccount(String accountId , String name)
	{
		System.out.println("Person.openAccount()");
	}
	
	//HAS-A relationship
	Employee employee;

}
class Employee extends Person{
	@Override
	public void openAccount(String accountId , String name)
	{
		System.out.println("Employee.openAccount()");
	}
}

