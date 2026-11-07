package com.kodewala.buffer;

public class QueryGenrator {


	public StringBuilder generateQuery(int salary, String empID) {
		StringBuilder querry = new StringBuilder("Select * from employe"); // Creted sb object
		
		if (salary>0)
		{
			querry.append ("where salary = " + salary + ";"); // modifying existing object
		}
		else if (empID != null)
		{
			querry.append ("where empID = " + empID + ";"); // modifying existing object
		}
		else
		{
			querry.append(";"); // modifying existing object
		}
		return querry;

	}

}
