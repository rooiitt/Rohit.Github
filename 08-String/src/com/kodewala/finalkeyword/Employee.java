package com.kodewala.final2;

class Employee {
	
	    final int empID; // final variable without assigning a value 

	    Employee(int id) { //constructor receives the value 10
	        empID = id;   // initializes --> empID to 101 for the first time.
	    }

	    public static void main(String[] args) {
	        Employee e = new Employee(101);
	        System.out.println(e.empID); // --> prints the value stored in empID.
	    }
	}

	

	


