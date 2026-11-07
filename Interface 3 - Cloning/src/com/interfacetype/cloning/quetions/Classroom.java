package com.interfacetype.cloning.quetions;
/*
 * Array Cloning 
 */
public class Classroom implements Cloneable{
	int[] marks = { 70,40,90 };
	
	public  Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Classroom classroom1 = new Classroom();
		
		Classroom classroom2 = (Classroom) classroom1.clone();
		classroom2.marks[0] = 100;
		
		System.out.println(classroom1.marks[0]);
		System.out.println(classroom2.marks[0]);
	}

}

