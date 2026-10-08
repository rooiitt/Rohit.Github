package com.kodewaka.constructor2;

class Invoice extends Object
{
	static int gst =18;
	int amount;
	String itemNmae;
	String billingAddress;
	String customerID;
	String customerName;
	
	Invoice(int amount, String itemNmae, String billingAddress,String customerID, String customerName )
	{
		this.amount = amount;
		this.itemNmae = itemNmae;
		this.billingAddress = billingAddress;
		this.customerID = customerID;
		this.customerName = customerName;
				
	}
	
 }

public class Driver {

	public static void main(String[] args) {
		
		Invoice obj = new  Invoice ( 2000, "IPhone15", "BTM 2nd stage", "D2134" , "Manasvi");
		
		Invoice obj1 = new  Invoice ( 2000, "Galaxy120", "BTM 1st stage", "D5464" , "Vishal");
		 System.out.println(obj.amount + " , "+ obj.itemNmae + " , "+ obj.billingAddress +","+ obj.customerID+" , "+ obj.customerName+" , "+ obj.gst);
		 System.out.println(obj1.amount + " , "+ obj1.itemNmae + " , "+ obj1.billingAddress +","+ obj1.customerID+" , "+ obj1.customerName+" , "+ obj1.gst);

	}

}
