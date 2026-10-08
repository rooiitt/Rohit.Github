package com.kodwala.construstors;

class Transaction extends Object {
	
	int ammount;
	String paymentMethod;   //Instance Variable
	String transictionId;
	static boolean paid = false; //Static Variable
	
	//Parameterize Constructor
	Transaction(int ammount ,String paymentMethod , String transictionId ){ 
		
		this.ammount = ammount;
		this.paymentMethod = paymentMethod; // Initialize Instance Variable
		this.transictionId = transictionId;
		this.paid = paid;                   // Initialize Static Variable
		
	}
	
}



public class Payment {

	public static void main(String[] args) {
		
		// Creating first Object
		Transaction obj = new Transaction (500 , "UPI" , "Txn12345");
		System.out.println(obj.ammount +" , "+ obj.paymentMethod+" , "+ obj.transictionId +" , "+obj.paid);
		
		//Creating Sec Object
		Transaction obj1 = new Transaction (500 , "UPI" , "Txn12345");
		System.out.println(obj1.ammount +" , "+ obj1.paymentMethod+" , "+ obj1.transictionId+" , "+obj1.paid);
		

	}

}
