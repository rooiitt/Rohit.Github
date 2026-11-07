package com.custom.markerinterface;

/*
 * why clone is protected --> if java make it public anybody start clonening
 */

 public class User implements Deletable { // User Object is the type of Deletable
	 
	 
	String userName;
	String id;
	public User(String userName, String id) {
		super();
		this.userName = userName;
		this.id = id;
	}

}
