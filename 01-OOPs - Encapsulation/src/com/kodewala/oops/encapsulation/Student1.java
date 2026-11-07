package com.kodewala.oops.encapsulation;

public class Student1 {
	private int age = 20;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

class DriverStu {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.setAge(22);
		System.out.println(s.getAge());
	}
}
