package com.kodewala.scanner;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ScnerDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name...");
		String name = sc.nextLine();
		
		System.out.println("Please enter product price");
		int price = sc. nextInt();
		
		sc.nextLine();
		
		System.out.println("Pleasse enter your delivery address..");
		String address = sc.next();
		
		System.out.println("Nmae is a " + name);
		System.out.println("Prise is  " + price);
		System.out.println("Address is " + address);
		
		sc.close();
		
		

	}

}
