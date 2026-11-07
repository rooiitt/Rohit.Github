package com.kodewala.string2;

 class ConceptFinal
 {
	final int UPI_LIMIT = 10000; // Constant in java 
	
	public final void doSomething1()
	{
		//UPI_LIMIT = 20000; // able to change the value
	}
	
	public void doSomething2()
	{
		// some function...
	}

}
class Account extends ConceptFinal
{
	@Override 
	public void doSomething2()
	{
		
	}
}
