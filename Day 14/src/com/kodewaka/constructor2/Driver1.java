package com.kodewaka.constructor2;

public class Driver1 {
	public static void main(String[] args)
	{
		NotificationService obj = new NotificationService ();
		
		obj.sendNotification("sms");
		obj.sendNotification("email");
		obj.sendNotification("other");
	}

}
