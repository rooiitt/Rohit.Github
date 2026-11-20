package com.kodewala.final2;

final class A {    //final class cannot be inherited
	int x = 10;   //Instance variable (value can be changed)

	void display() {  // Method to display the value of x
		System.out.println(x);
	}
}

public class Main {
	public static void main(String[] args) {
		A obj = new A(); // Method to display the value of x
		obj.x = 20;  //Changing x from 10 to 20
		obj.display();
	}
}
