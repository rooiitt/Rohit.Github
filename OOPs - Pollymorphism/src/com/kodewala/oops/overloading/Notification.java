package com.kodewala.oops.overloading;

public class Notification {
	public void sendNotification() {
		System.out.println("Sending Notifications");

	}

}

class EmailNotification extends Notification {
	@Override
	public void sendNotification() {
		System.out.println("Sending EmailNotifications");

	}
}

class SMSNotifications extends Notification {
	@Override
	public void sendNotification() {
		System.out.println("SMSNotifications");
	}
}

class PushNotification extends Notification {
	@Override
	public void sendNotification() {
		System.out.println("PushNotification");
	}

	public static void main(String[] args) {
		Notification n = new Notification();
		n.sendNotification();
		EmailNotification e = new EmailNotification();
		e.sendNotification();
		SMSNotifications s = new SMSNotifications();
		s.sendNotification();
		PushNotification p = new PushNotification();
		p.sendNotification();

	}
}
