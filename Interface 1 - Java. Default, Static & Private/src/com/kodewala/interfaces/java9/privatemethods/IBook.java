package com.kodewala.interfaces.java9.privatemethods;

/*
 * Java 9 ---> Introduced private method in interface
 * This will help use to avoid code duplicate
 */
public interface IBook {
	default void autoUpgrade() {
		// 500 line of code here ( connecting with DataBace, upgrading) ---> Connecting to DB ( Code duplicate )
		connecttoDB();
		System.out.println("Auto Upgrade");
	}
	default void sendNOtification() {
		//200 lines of code here ( connecting with DataBase , sending notification) ---> Connecting to DB ( Code duplicate )
		connecttoDB();
		System.out.println("Send Notification");
	}
	private void connecttoDB() {
		System.out.println("IBooking.connecttoDB()");
	}

}
