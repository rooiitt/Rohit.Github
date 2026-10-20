package com.kodewala.interning;

public class Concept3 {
	public static void main(String[] args) {
		//String s1 = "This" + " is form " + "Kodewala Academy Banglore"; // litral without refrence 
		
		String s1 = "This is from Kodewala Academy Banglore";
		System.out.println(s1);
		
		String s2 = "Kodewala"; // SCP
		String s3 = "Academy"; // SCP
		
		String s4 = s2 + s3; // heap ---> new StringBuulder();
		System.out.println(s4);
		
		String s5 = "KodewalaAcademy";
		
		System.out.println(s5 == s4);
		System.out.println(s5 == s4.intern() ); // True 
		

}
}
