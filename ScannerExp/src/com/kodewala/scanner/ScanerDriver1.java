package com.kodewala.scanner;

import java.util.Scanner;

public class ScanerDriver1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int price = 0;
		
		
		if (sc.hasNextInt())
		{
			price = sc.nextInt();
		}
		else 
		{
			System.out.println("Plase enter the price in the right format");
		}
		System.out.println("price : "+ price);
		sc.close();
		
		
	}

}
