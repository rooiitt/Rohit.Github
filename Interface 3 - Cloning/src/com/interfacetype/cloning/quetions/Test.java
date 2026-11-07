package com.interfacetype.cloning.quetions;

class Student implements Cloneable {
	int marks = 80;

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Test {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student();
		Student s2 = (Student) s1.clone();

		s2.marks = 95;

		System.out.println(s1.marks);
		System.out.println(s2.marks);
	}
}