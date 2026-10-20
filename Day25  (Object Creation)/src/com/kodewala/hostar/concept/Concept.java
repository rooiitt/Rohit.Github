package com.kodewala.hostar.concept;

import java.util.Iterator;

public class Concept {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10000; i++) { //10000 users are using the application
			User user = new User ("guest" , "free");
			
		}
		
//		User u1 = new User ("guest" , "free");
//		User u2 = new User ("guest" , "free");
//		User u3 = new User ("guest" , "free");
//		
//		User u4 = new User("Kodewala", "KW123" , "paid");
//		User u5 = new User("Kodewala Academy", "KM12344" , "paid");
		
		System.out.println("Total live users are : " + User.LiveUsersCont);
		
		
		

	}

}
