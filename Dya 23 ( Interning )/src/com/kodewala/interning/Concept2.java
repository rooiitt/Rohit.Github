package com.kodewala.interning;

public class Concept2 {

	public static void main(String[] args) {
		//String s1 = "This" + " is form " + "Kodewala Academy Banglore"; // literal without reference 
		
		String s1 = "This is from Kodewala Academy Banglore";
		System.out.println(s1);
		
		String s2 = "Kodewala"; // SCP --> with reference 
		String s3 = "Academy"; // SCP
		
		String s4 = s2 + s3; // heap ---> new StringBuulder();
		System.out.println(s4);
		
		String s5 = "KodewalaAcademy";
		
		System.out.println(s5 == s4); // false --> both stored in heap to put location to SCP we use intern()

	}

}
