package com.memoryleak;

/*
 * Memory leak --> happens when the we have a minimum heap memory but our application create more Objects than the the size of the heap and does not
 * fit in a heap in that condition we call the Memory leak!
 * 
 * Why do we call it memory leak then? because the Memory Overloading there is no leak happen but the memory JVM stop working and shows OutOfMemoryError
 * 
 * how do we check the heap size  -Xms1024-Xmx2048!! we will get the error if we max out the size than the actual size of the heap checked in/by  VM (Virtual Machine).
 * 
 * JAVA OPTS (VM Arguments):- 
 *   1. Heap Size :-  heap size  -Xms1024-Xmx2048!!
 *   2. Stack
 *   3.Garbage Collector(GC).
 *   etc..
 *   
 *   Garbage Collector(GC) :- The role of the GC to remove unused Object/ Eligible For GC.
 *   
 *   How do we make it Eligible for GC :- by making it null.
 *   
 */
public class MemoryLeak {

	Address address;
	Employee emp1;
	Employee cloneEmp;

	public void dosomething() throws CloneNotSupportedException {

		address = new Address("BTM Layout", "Stage 2", "Bangaluru");

		emp1 = new Employee("Rohit", "RR321", address);
		
		cloneEmp = (Employee) emp1.clone();
		
		emp1.address.city = "Hyd";

		System.out.println(emp1.clone());
		System.out.println(cloneEmp.address.city);
		
		address = null; // Eligible for GC 
		emp1 = null; // Eligible for GC  

	}

}
