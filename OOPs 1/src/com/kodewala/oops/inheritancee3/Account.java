package com.kodewala.oops.inheritancee3;

public class Account 
{ 
	public void openAccount(String uerId , String email) // X --> 
	{
		System.out.println("Account.openAccount()");
	}

}
class SavingAccount extends Account
{
	@Override // Change the  class method's functionalities 
	public void openAccount(String uerId , String email)
	{
		System.out.println("SavingAccount.openAccount()");
	}
}
class SrCitAccount extends SavingAccount
{
	@Override
	public void openAccount(String uerId , String email)
	{
		System.out.println("SrCitAccount.openAccount()");
	}
}
class PensionAccount extends SrCitAccount
{
	@Override
	public void openAccount(String uerId , String email)
	{
		System.out.println("PensionAccount.openAccount()");
	}
	
}