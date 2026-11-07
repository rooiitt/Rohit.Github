package com.oops.quetions.encapsulation1;

public class Student {
	private int age = 20;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		 return age;
	}

}

class Main {
	public static void main(String[] args) {
		Student s = new Student();
		s.getAge(); // Setter Method
		System.out.println(s.getAge());
		
	}
}
