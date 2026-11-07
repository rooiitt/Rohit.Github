package com.kodewala.oops.encapsulation;

public class Student {
	private String name;
	private int rollNumber;
	private int age;
	private String college;

	public Student(String name, int rollNumber, int age, String college) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;
		this.college = college;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcollege() {
		return college;
	}

	public void setcollege(String college) {
		// we can add Validations --> college should be real.
		this.college = college;
	}
	public int getrollNumber() {
		return rollNumber;
	}
	public void setrollNumber(int rollNumber) {
		 this.rollNumber = rollNumber;
	}

}
class Driver {
	public static void main(String[] args) {
		Student s = new Student("Rohit", 21, 22, "SSGB");
		
		System.out.println(s.getName());
		System.out.println(s.getcollege());
		System.out.println(s.getrollNumber());
		
		s.setcollege("DBATU");
		s.setrollNumber(22);
		
		System.out.println(s.getcollege());
		System.out.println(s.getrollNumber());
		
	}
}