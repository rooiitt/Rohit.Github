package com.kodewala.interfaces.java7;

/*
 * Interface defines a contract.
 * Every notification class must implement send().
 */

public interface Notification {
	void send(String message);

}

class Email implements Notification {

	@Override
	public void send(String message) {
		System.out.println("Sending Email" + " " + message);

	}

}

class SMS implements Notification {

	@Override
	public void send(String message) {
		System.out.println("Sending SMS" + " " + message);

	}

}

class push implements Notification {

	@Override
	public void send(String message) {
		System.out.println("Sending Push notification" +" "+ message );

	}

}

class WhatsApp implements Notification {

	@Override
	public void send(String message) {
		System.out.println("Sending  WhatsApp" + " " + message);

	}

}

class NotificationService {
	void sendNotification(Notification notification, String message) {
		notification.send(message); // Polymorphism
	}
}

class NotiDriver {
	public static void main(String[] args) {
		NotificationService notificationService = new NotificationService();
		
		Notification n = new Email();  // For Email
		notificationService.sendNotification(n, "Hello");
		
		Notification n1 = new SMS(); // For SMS
		notificationService.sendNotification(n1, "Hello");
		
		Notification n2 = new push(); // For push 
		notificationService.sendNotification(n2, "Hello");
		
		Notification n3 = new WhatsApp(); // For WhatsApp
		notificationService.sendNotification(n3, "Hello");
		
		
		
		
		
		
	}

}
