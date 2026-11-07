package com.kodewala.buffer;

public class DriverQuerry {

	public static void main(String[] args) {
		QueryGenrator obj = new QueryGenrator();
		StringBuilder result = obj.generateQuery(0, "KD4321");
		
		System.out.println(result);

	}

}
