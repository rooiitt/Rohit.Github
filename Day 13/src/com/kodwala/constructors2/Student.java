package com.kodwala.constructors2;

class Student {
	int rollNO;
	String name;
	
	public Student(int rollNO, String name) {
		
		this.rollNO = rollNO;
		this.name = name;
	}
	


public void display(){
	
	System.out.println("Roll No : " + rollNO);
	System.out.println("Name : " + name);
	
}


}
