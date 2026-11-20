package com.kodewala.oops.polymorphism1;
/*
 Employee e1 = new HRManager(); --> First preference will get to actual Object child class.
 If method is not there the method will go and check Parent class
 */
public class Employee {
	public void markIn() {
		System.out.println("Employee.markIn()......Employee Markin In");
	}

}

class HRManager extends Employee {
	@Override
	public void markIn() {
		System.out.println("HRManager.markIn()..........HRManager Markin In");

	}
}

class Driver {
	public static void main(String[] args) {
		
		//Employee e1 = new Employee(); e1.markIn();

		Employee e1 = new HRManager();
		e1.markIn(); // same method will behave differently based on the actual object
		// 1. at the time of compilation, it will check the method's exists in class
		// Employee
		// 2. at the time of execution (while runing), it will call the method on actual
		// object
	}
}

