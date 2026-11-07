package com.interfacetype.cloning;
/*
 * 
 */
public class EmployeeDriver {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address= new Address("BTM Layout", "Stage 2", "Bangaluru");
		
		Employee emp = new Employee("Rohit", "RR321", address);
		
		Employee cloneEmp = (Employee) emp.clone(); // Cloning Method

 
		emp.address.city = "Maharashtra"; // Changing
		
		System.out.println(emp.address.city); //--> Maharashtra
		System.out.println(cloneEmp.address.city); //Clone Object //--> Maharashtra
}

}
