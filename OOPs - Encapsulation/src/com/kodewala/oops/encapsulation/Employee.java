package com.kodewala.oops.encapsulation;

public class Employee {
	private int salary = 20000;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

class Main1 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setSalary(7777777);
		System.out.println(e.getSalary());
		
	}
}
