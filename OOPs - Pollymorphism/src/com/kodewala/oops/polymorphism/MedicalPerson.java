package com.kodewala.oops.polymorphism;

public class MedicalPerson {
	public void treat() {
		System.out.println("MedicalPerson.treat()..........Medical Person Treat");
	}

}

class Doctor extends MedicalPerson {
	@Override
	public void treat() {
		System.out.println("Doctor.treat()......Doctor Treating ");
	}
}

class Surgeon extends Doctor {
	@Override
	public void treat() {
		System.out.println("Surgeon.treat().....Surgeon Treating");
	}

	public void performSurgery() {
		System.out.println("Surgeon.performSurgery()....Performing Surgery");
	}

	public static void main(String[] args) {

		MedicalPerson m = new Surgeon(); // Up-casting
		m.treat();
		
		Surgeon s = (Surgeon)m;
		s.treat();
		s.performSurgery();

		
	}
}