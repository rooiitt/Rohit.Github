package com.kodewala.oops.abstarction1;

abstract class Appoiment {
	abstract void bookAppoiment();

}
class OnlineAppointment extends Appoiment{

	@Override
	void bookAppoiment() {
		System.out.println("OnlineAppointment.bookAppoiment()......OnlineAppointment");
		
	}
	
}
class EmergencyAppointment extends Appoiment{

	@Override
	void bookAppoiment() {
		System.out.println("EmergencyAppointment.bookAppoiment().......EmergencyAppointment");
		
	}
	public static void main(String[] args) {
		Appoiment a = new OnlineAppointment(); //
		a.bookAppoiment();
		
		Appoiment a1 = new EmergencyAppointment();
		a1.bookAppoiment();
		
	}
	
}
