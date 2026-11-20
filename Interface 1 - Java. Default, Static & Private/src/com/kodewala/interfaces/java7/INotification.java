package com.kodewala.lecture.interface1;
/*
 * Notification System
 */

public interface INotification {
	boolean sendNotification(String message);

}
class EmailNotification implements INotification{

	@Override
	public boolean sendNotification(String message) {
		System.out.println("EmailNotification.sendNotification()" +" "+ message);
		return true;
	}
	
}
class SMSNotification implements INotification{

	@Override
	public boolean sendNotification(String message) {
		System.out.println("SMSNotification.sendNotification()" +" "+ message);
		return true;
	}
	
}
class PushNotification implements INotification{

	@Override
	public boolean sendNotification(String message) {
		System.out.println("PushNotification.sendNotification()" +" "+ message);
		return false;
				
	}
	
}
class NotificationService{
	void notifyUser(INotification notification , String message) {
		boolean result = notification.sendNotification(message);  // Polymorphism
		
		
		if(result) {
			System.out.println("Notification Deliverd");
		}else {
			System.out.println("Faild");
		}
	}
}

class NotifiDriver{
	public static void main(String[] args) {
		NotificationService notificationService = new NotificationService();
		
		
		INotification i = new EmailNotification();
		INotification i1 = new SMSNotification();
		INotification i2 = new PushNotification();
		
		
		notificationService.notifyUser(i, "Hello");
		notificationService.notifyUser(i1, "Hello");
		notificationService.notifyUser(i2, "Hello");
		
		
		
		
		
	}
}