package com.custom.markerinterface;
/*
 * 
 */

public class DataCleaner {
	public void clean(Object obj) { // Object obj = new User();
		
		if (obj instanceof Deletable) {
			
			System.out.println("Allow to perform the data cleaning ");
			//100 lines
		}else {
			System.err.println("Not allowed to perform cleaning the activity");
		}
	}

}
