package com.kodewala.oops.inheritancee3;

public class Human {
	//IS-A & HAS-A
	public void displayperson() {
		System.out.println("Person Identity");
	}

}

class Doctor extends Human {  //IS-A relationship
	public void treathuman() {
		System.out.println("Treated The Person");
	}
}

class Hospital {
	
	Doctor doctor; // HA-S relationship
    // Constructor 
	public Hospital(Doctor doctor) {
		super();
		this.doctor = doctor;
	}

	public void health() {
		doctor.displayperson();
		doctor.treathuman();
		System.out.println("Health Checkd has been done");
	}
}
