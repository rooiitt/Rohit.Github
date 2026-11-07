package com.custom.markerinterface;
/*
 * Cleaning the user Object!! We can create 
 * 
 * Can you write your own Marker example? --> Yes ( but we have to give the permission)
 */
public class UserDriver {
	public static void main(String[] args) {
		
		User user  = new User("Rohit ", "Rohit Gaikwad");
		
		System.out.println(user.userName);
		
		DataCleaner del = new DataCleaner();
		del.clean(user);
		
	}

}
