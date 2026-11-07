package com.kodwala.construstors;

class Bill extends Object{
	
	int billNo;
    String customerName;
    String productName;
    int quantity;
    double price;
    static String companyName = "Kodewala";
    		
    Bill(int billNo, String customerName , String productName , int quantity, double price){
    	
    	this.billNo = billNo;
    	this.customerName = customerName;
    	this.productName = productName;
    	this.quantity = quantity;
    	this.price = price;
    	
    }
	
}

public class Static2 {

	public static void main(String[] args) {
		
		Bill obj = new Bill(1400, "Rohit" , "Laptop" ,77, 60 );
		Bill obj1 = new Bill(1500, "Vishal" , "Mobile" ,88, 55  );
		
	    System.out.println(obj.billNo +" "+ obj.customerName +","+obj.productName +","+ obj.quantity +","+ obj.price+","+ "companyName");
	    System.out.println(obj1.billNo +" "+ obj1.customerName +","+obj1.productName +","+ obj1.quantity +","+ obj1.price+","+ "companyName");
		
		

	}

}
