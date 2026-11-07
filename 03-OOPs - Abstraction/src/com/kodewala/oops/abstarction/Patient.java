package com.kodewala.oops.abstarction;

public class Patient {
	public void patientBookingApopitment(String name, double time) {
		appoiment(name);
		scheduleAppointment(name, time);

		return;

	}

	private void appoiment(String name) {
		System.out.println("Patient.appoiment()" + name);
	}

	private void scheduleAppointment(String name, double time) {
		System.out.println("Patient.scheduleAppointment()" + name +" , "+ time);
	}

}

class OnlineAppointment extends Patient {
	public void patientBookingApopitment(String name, double time) {
		appoimentName(name);
		scheduleAppointmentTime(name, time);

		return;

	}

	private void appoimentName(String name) {
		System.out.println("Patient.appoiment()" + name);
	}

	private void scheduleAppointmentTime(String name, double time) {
		System.out.println("Patient.scheduleAppointment()" + name +" , "+ time);
	}
}

class EmergencyAppointment extends Patient {
	public void patientBookingApopitment(String name, double time) {
		appoimentEmergency(name);
		scheduleAppointmentEmergency(name, time);

		return;

	}

	private void appoimentEmergency(String name) {
		System.out.println("Patient.appoiment()" + name);
	}

	private void scheduleAppointmentEmergency(String name, double time) {
		System.out.println("Patient.scheduleAppointment()"+ name +" , "+ time);
	}

}
