package com.kodewala.final2;

class AccountMgmt { // This class can not become parent.
	 final int UPI_LIMIT = 100000; //CONSTAT in java with final we cannot change the value 
	
	public void doSomething() {
//		UPI_LIMIT = 20000; // 
		System.out.println("UPI_LIMIT IS UPDATED " + UPI_LIMIT );
	}


}

class Account extends AccountMgmt {

	@Override
	public void doSomething() {
		
	}
	public void doSomething2() {
//		UPI_LIMIT = 300000;
		System.out.println("UPL_LIMIT IS UPDATED " + UPI_LIMIT);
	}
	

}
class DriverAccount{
	public static void main(String[] args) {
		AccountMgmt a = new AccountMgmt();
		a.doSomething();
		
		Account c = new Account();
		c.doSomething();
		c.doSomething2();
		
	}
}
