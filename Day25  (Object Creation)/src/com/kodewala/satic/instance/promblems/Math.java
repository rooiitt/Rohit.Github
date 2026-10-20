package com.kodewala.satic.instance.promblems;

public class Math {
	int number= 10;
	{
		number = 20;
	}
	Math(){
		number = 60;
	}
	public static void main(String[] args) {
		Math m = new Math();
		Math m2 = new Math();
		
		System.out.println(m.number);
		System.out.println(m2.number);
	}

}
