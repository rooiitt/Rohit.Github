package com.kodewala.final2;

public class QueFinal2 {

	public static void main(String[] args) {
		
		 StringBuilder sb = new StringBuilder("Hello"); //The final local variable sb cannot be assigned.
		                                                //It must be blank and not using a compound assignment
		sb = new StringBuilder("World");
		System.out.println(sb);

	}

}
