package com.kodewala.quetions;

public class Demo8 {
	    static int count = 0;

	    static {
	        count++;
	        System.out.println("Static: " + count);
	    }

	    {
	        count++;
	        System.out.println("Instance: " + count);
	    }

	    public static void main(String[] args) {
	        new Demo8();
	        new Demo8();
	    }
	}


