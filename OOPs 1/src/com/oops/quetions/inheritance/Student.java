package com.oops.quetions.inheritance;

public class Student {
	void ststudent (int x) {
		System.out.println(x);
	}

}
class Knvstudents extends Student{
	 void knvstudents(){
		 super.ststudent(10);;
		System.out.println("knv");
	}
}
class StuDriver{
	public static void main(String[] args) {
		Knvstudents k = new Knvstudents();
		k.knvstudents();
		
		
	}
}