package com.oops.quetions.encapsulation2;

/*
 * Variable (Data) + Methods (Logic functionality)
 *        
 *        <modify>
 */

public class Student {
	private int age;

	public void setAge(int age) { // setter method
		this.age = age;
	}

	public int getAge() { // getter method
		return age;
	}
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setAge(22);
		System.out.println(s.getAge());
	}
}
