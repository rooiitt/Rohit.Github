package com.kodewala.quetions;

//No object creation
 class Demo2{
	    static {
	        System.out.println("Static Block");
	    }

	    {
	        System.out.println("Instance Block"); //The Instance Block does not execute because 
                                                 //	No object is created using new Demo()
	    }

	    public static void main(String[] args) {
	        System.out.println("Hello");
	    }
	}
