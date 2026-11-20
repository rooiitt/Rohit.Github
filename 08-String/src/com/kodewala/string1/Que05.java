package com.kodewala.string1;

public class Concept6 {
	public static void main(String[] args) 
	{
		String a  = new String ("java");
		String b = new String ("java");
		String c = a;
		
		System.out.println(a == b);
		System.out.println( a == c); // c = a; --> copies a reference but does not
		                             // create object.

		
		}
		
	}


	




