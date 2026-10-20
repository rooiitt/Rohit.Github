package com.oops.quetions.encapsulation1;

public class Employeee {

	private int salary = 20000;

	public void setSalary(int salary) { // 20000 set the salary
		this.salary = salary;
	}

	public int getSalary() { // get the 20000 salary
		return salary;
	}

class Main6{
	public static void main(String[] args) {
		Employeee e1 = new Employeee();
		Employeee e2 = e1;

		e1.setSalary(30000);
		System.out.println(e2.getSalary());
	}
		
	}
}
	
	


