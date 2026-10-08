package com.kodewala.costructor;

public class Driver {
	public static void main(String[] args) {
		
		AccountHolder user1 = new AccountHolder( 122,"739836727647", "Rohit", "64764648738");
		AccountHolder user2 = new AccountHolder(356, "75776583373", "Rahul", "766474847568");
		
        System.out.println(user1.name);
        System.out.println(user2.name);
        
	}

}

   