package com.oops.quetions.encapsulation1;

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
		e.setSalary(30000);
		System.out.println(e.getSalary());
		
	}
}
