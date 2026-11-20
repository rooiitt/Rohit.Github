package com.kodewala.quetions;

class Demo4 {
//	Static block and static variable
	
	static int x = 10;  //  x becomes 10

	static {
	    x = 20; // Static block modify x to 20
	    
	    System.out.println(x); // Prints --> 20
	}

	public static void main(String[] args) {
		
	    System.out.println(x); // Prints --> 20
	}

}
