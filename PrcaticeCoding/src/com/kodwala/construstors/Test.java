package com.kodwala.construstors;

class Payment {
	void pay() {
		System.out.println("Parent Payment");
	}

	static void display() {
		System.out.println("Parent Static");
	}
}

class UPI extends Payment {
	void pay() {
		System.out.println("UPI Payment");
	}

	static void display() {
		System.out.println("Child Static");
	}
}

public class Test {
	public static void main(String[] args) {
		Payment p = new UPI();

		p.pay();
		p.display();
	}
}