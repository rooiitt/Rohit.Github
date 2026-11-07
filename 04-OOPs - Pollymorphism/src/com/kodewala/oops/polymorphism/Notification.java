package com.kodewala.oops.polymorphism;

public class Notification {
	public void send() {
		System.out.println("Notification.send().....Notificatyion send");
	}

}
class EmailNotification extends Notification {
	@Override
	public void send() {
		System.out.println("EmailNotification.send()......Email Notification");
	}
	public void attachFile() {
		System.out.println("EmailNotification.attachFile()......Attach File");
	}
}
class SMSNotification extends EmailNotification {
	public void send() {
		System.out.println("SMSNotification.send()...SMSNotification");
	}
	public static void main(String[] args) {
		
		Notification n = new EmailNotification(); // Auto up-casting
		n.send();
		
		EmailNotification e = (EmailNotification)n; // Down-casting
		e.attachFile();
		
	}
}
