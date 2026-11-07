package com.kodewala.oops.abstarction;

public class DriverPatient {
	public static void main(String[] args) {
		Patient p = new Patient();
		p.patientBookingApopitment("Rohit", 7.30);
		
		OnlineAppointment o = new OnlineAppointment();
		o.patientBookingApopitment("Anmole", 5.30);
		
		EmergencyAppointment e = new EmergencyAppointment();
		e.patientBookingApopitment("Dhruv", 12.30);
		
		
	}

}
