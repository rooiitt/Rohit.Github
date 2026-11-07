package com.interfacetype.deepcloning.quetions;

public class Student implements Cloneable {

	String studentName;
	Univercity univercity;

	@Override // deep cloning
	public Object clone() throws CloneNotSupportedException {

		Student student = (Student) super.clone();

		student.univercity = (Univercity) univercity.clone();

		return student;
	}
}
