package com.oops.quetions.encapsulation2;

import com.oops.quetions.encapsulation1.Employeee;

public class Employee {
	private double salary;

	public void setSalary(double salary)
	{
		if (salary > 0) {
		this.salary = salary;
		System.out.println("Valid Salary: " + salary );
	} else 
		
		System.out.println("Invalid Salary");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setSalary(70000.0);
	}

}
