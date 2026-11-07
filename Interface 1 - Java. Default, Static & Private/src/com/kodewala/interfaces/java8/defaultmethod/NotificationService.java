package com.kodewala.interfaces.java8.defaultmethod;
/*
 * to call the Original Default Method
 */

public interface NotificationService {
    default void sendNotification() {
        System.out.println("General notification sent");
    }
}

class EmailNotification implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Email notification started");
        
        NotificationService.super.sendNotification(); // --> By this 

       
    }
    public static void main(String[] args) {
    	
    	
    	
    	NotificationService notificationService = new EmailNotification();
    	notificationService.sendNotification();
    	
	}
}


