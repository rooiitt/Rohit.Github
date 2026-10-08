package com.kodwala.constructorstThis;

class SeniorEmploye extends Object 
{
	
     }

public class User {
	
	String employeName;
	String employeID;
	String contact;
	
	User(String employeName , String employeID , String contact){
		
	//this(67); calling this method
	this.employeName = employeName;
	this.employeID = employeID;
	this.contact = contact;
}

	
  User(int age){
    	
  System.out.println(" calling the default coustroctor");
}

    
    	
    
public void display() {
		
	System.out.println("EmployeName Name : " + employeName);
    System.out.println("Employe ID: " + employeID);
	System.out.println("Contact : " + contact);
	
     }
 
}
 



