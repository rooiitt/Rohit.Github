package com.kodewala.control.flow2;

public class AtmWithdrawal {
	public String Withdrawal (int Money) {
		String ammount = null;
		if (Money <= 1000)
		{
			ammount = "Basic Withdrawal";
		}
		else if ( Money >= 5000)
		{
			ammount = "Standard Withdrawal";
		}
		else if (Money <= 10000)
		{
			ammount = "Primiinum Withdrawal";
			
		}
		else if (Money >= 10000)
		{
			ammount = "Withdrawal not ALLOWED";
		}
		return ammount;
		
	}

}
