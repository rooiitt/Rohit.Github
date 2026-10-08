package com.kodewaka.constructor2;

public class NotificationService 
{
	public void sendNotification (String _type)
	{
		System.out.println("NotificationService.sendNotification()");
		
		if(_type.equalsIgnoreCase("sms"))
		{  
			sendSMS();
			
		}
		else if(_type.equalsIgnoreCase("email"))
		{
			sendEmail();
		}
		else 
		{
			sendWhatsapp();
			
		}	
		
	}
	private void sendSMS()
	{
		System.out.println("NotificationService.sendSms() START");
		// Biz Logic
		System.out.println("NotificationService.sendSms() END");
	}
	private void sendEmail()
	{
		System.out.println("NotificationService.sendEmail() START");
		 // Biz Logic
		System.out.println("NotificationService.sendSms() END");
	}
	private void sendWhatsapp()
	{
		System.out.println("NotificationService.sendWhatsapp() START");
		 // Biz Logic
		System.out.println("NotificationService.sendSms() END");
	}
}
