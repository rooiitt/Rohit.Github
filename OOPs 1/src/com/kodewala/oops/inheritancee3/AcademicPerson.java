package com.kodewala.oops.inheritancee3;

public class AcademicPerson {
	public void displayDuties() {
		System.out.println("AcademicPerson.displayDuties()");
	}

}
class Examsupervisor extends AcademicPerson {
	@Override
	public void displayDuties() {
		System.out.println("ExamSupervisor manages examination hall");
	}
	

}
class ExaminationHall{
	AcademicPerson person;

	public ExaminationHall(AcademicPerson person) {
		super();
		this.person = person;
	}
	
	public void showDuties() {
		person.displayDuties();
	}

	public static void main(String[] args) {
		Examsupervisor e = new Examsupervisor();
		
		ExaminationHall x = new ExaminationHall(e);
		
		x.showDuties();
		
	}
}






