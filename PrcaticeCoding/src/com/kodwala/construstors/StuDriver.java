package com.kodwala.construstors;

public class StuDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentClass sc = new StudentClass(21 , "Rohit" , "B" , 75.5);
		System.out.println(sc.rollNO +" , "+ sc.name +" , "+ sc.branch +" , "+ sc.percentage);

	}

}
