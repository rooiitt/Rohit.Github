package com.kodewala.interfaces.java7;

/*
 * Multiple Interfaces are Allowed!
 * It allows one class to follow multiple Contracts 
 * --> Can'not extends Multiple Classes
 * --> A class implements multiple interfaces (Allowed)
 * --> A class extends one class and implements multiple interfaces (Allowed)
 */

interface Printable {
	void print();   // Contracts 

}

interface Scannable {
	void scan(); // Contracts 
}

class Printer implements Printable, Scannable {

	@Override
	public void scan() {
		System.out.println("Scaning");

	}

	@Override
	public void print() {
		System.out.println("Printing");

	}

}