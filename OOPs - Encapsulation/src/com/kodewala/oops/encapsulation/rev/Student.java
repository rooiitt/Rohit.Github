package com.kodewala.oops.encapsulation.rev;

//Encapsulation

public class Student {
	private String studentName;
	private int stuentMarks;

	public Student(String studentName, int stuentMarks) {
		super();
		this.studentName = studentName;
		this.stuentMarks = stuentMarks;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStuentMarks(int studentMarks) {
		if (studentMarks >= 0 && studentMarks <= 100) { //Logic
			this.stuentMarks = studentMarks;
			System.out.println("You Got" +" "+ studentMarks +" "+ " Marks");
		}else {
			System.out.println("Invalid Marks");
		}
		
	}

	public String getStudentName() {
		return studentName;
	}

	public int getStuentMarks() {
		return stuentMarks;
	}

}
class StuDriver{
	public static void main(String[] args) {
		Student s = new Student("Ohit", 88);
		
		
		s.setStuentMarks(-20);
		
		
		System.out.println(s.getStuentMarks());
		
	}
}
