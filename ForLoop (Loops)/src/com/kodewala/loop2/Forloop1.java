package com.kodewala.loop2;

public class Forloop1 {

	public static void main(String[] args) {
		int[] numbers = { 12, -7, 0, 24, -15, 8, -3, 19, -22, 5, -10, 31, -1, 14, -18, 6, -29, 3, -11, 20};
		// multiply +ve numbers by 10
		
		for(int index = 0; index< numbers.length; index++)
		{
			int currentNumber = numbers[index];
			
			if(currentNumber < 0)
			{
				continue; // skip the current iteration
			}
			System.out.println(currentNumber*10); // biz ---> 100 lines 
		}

	}

}
