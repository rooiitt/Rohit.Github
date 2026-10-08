package com.kodewala.control.flow2;

public class FoodDelivery {
	public String disscountApply(int ammount) {
		String disscount = null;
		if (ammount<500)
		{
			disscount = "Sorry there will be no discount";
		}
		else if (ammount >=500 && ammount <= 1000)
		{
			disscount = "You Got 5% Disscount Congratulations";
		}
		else if (ammount > 1000)
		{
			disscount = " You Got 10% Disscount Congratulations ";
			
		}
		return disscount;
	}

}
