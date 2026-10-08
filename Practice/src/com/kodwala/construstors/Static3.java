package com.kodwala.construstors;

class Tax extends Object {
	static double taxrate = 18.5;
	static double ammount = 5000.0;
	String taxtype;
	String customerNamr;
	
	Tax(String taxtype , String customerNamr ){
		
		this.taxtype = taxtype;
		this.customerNamr = customerNamr;
		
	}
}



public class Static3 {

	public static void main(String[] args) {
		
	    Tax obj = new Tax("GST" , "Rohit");
	    System.out.println(obj.taxtype +" , "+ obj.customerNamr +" , "+ obj.taxrate +" , "+ obj.ammount );
	    
	    Tax obj1 = new Tax("Income Tax" , "Vishal");
	    System.out.println(obj1.taxtype +" , "+ obj1.customerNamr +" , "+ obj1.taxrate +" , "+ obj1.ammount );

	}

}
