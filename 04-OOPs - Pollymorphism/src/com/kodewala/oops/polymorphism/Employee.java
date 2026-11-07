package com.kodewala.oops.polymorphism;

public class Employee {
	public void work() {
		System.out.println("Employee.work().....Work");
	}

}

class Developer extends Employee {
	@Override
	public void work() {
		System.out.println("Developer.work()......Developer Work");
	}

	public void debugCode() {
		System.out.println("Developer.debugCode()....Debugging Code");
	}
	public static void main(String[] args) {
		
		//UP-casting
		Employee e = new Developer();
		e.work();
		
		//Down-casting 
		Developer d = (Developer) e; 
		d.debugCode();
		
		
		
	}
}
