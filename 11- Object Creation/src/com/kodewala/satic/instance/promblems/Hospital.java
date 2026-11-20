package com.kodewala.satic.instance.promblems;

public class Hospital {
	static{
		System.out.println("Hospital System Started");
	}
	{
		System.out.println("New Patient Record");
	}
	Hospital(){
		System.out.println("Patient Registered");
	}

}
class HospiDriver{
	public static void main(String[] args) {
		Hospital h = new Hospital();
		Hospital o = new Hospital();
		
	}
}
