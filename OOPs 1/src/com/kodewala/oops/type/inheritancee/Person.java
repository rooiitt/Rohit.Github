package com.kodewala.oops.type.inheritancee;

public class Person { // Multilevel Inheritance 
	public void displayPerson() {
		System.out.println("Name OF Person");
	}

}
class Employee extends Person{
	public void work() {
		System.out.println("Instructed Work");
		
	}
}
class Manage extends Employee{
	public void manageTeam() {
		System.out.println("Managiinig Team");
	}
}
class Driver{
	public static void main(String[] args) {
		Manage m = new Manage();
		m.displayPerson();
		m.work();
		m.manageTeam();
	}
}

