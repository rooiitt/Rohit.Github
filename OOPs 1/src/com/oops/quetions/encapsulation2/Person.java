package com.oops.quetions.encapsulation2;

public class Person {
	private int age;

	public void setAge(int age) { // set age 
		if (age >= 0) {
			this.age = age;
			System.out.println("Current Age: " + this.age);
		} else {
			System.out.println("Invalid Age: ");
		}

	}

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(21);

	}
}
