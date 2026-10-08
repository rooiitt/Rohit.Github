package com.kodwala.construstors;

class Invoice extends Object{
	
	static String company;
	static int gst = 16;
	String deviceName;
    String address;
    
    Invoice(String company , String deviceName ,String address )
    {
    	
    	this.company = company;
    	this.deviceName =deviceName;
    	this.address = address;
    	
    	
    }
	
}



public class Static1 {

	public static void main(String[] args) {
		
	Invoice obj = new Invoice("Amazon", "IPhone" , "BTM 2nd stage");
	Invoice obj1 = new Invoice("Amazon", "IPhone" , "BTM 2nd stage");
	
	System.out.println(obj.company +", "+ obj.deviceName +", "+obj.address+","+ obj.gst);
	System.out.println(obj1.company +", "+ obj1.deviceName +", "+obj1.address+", "+ obj1.gst);
				

	}

}
