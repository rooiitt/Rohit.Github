 package com.kodewala.loop2;

public class WhileClass {
	public static void main(String[] args) {
		{
			int max = 10;
			int number = 0;
			
			while(number<max) // this will execute till condition is true  
			{
				System.out.println("executing..." + number);
				number = number +1;
			}
		}
	}

}
