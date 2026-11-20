package com.kodewala.satic.instance.promblems;

/*
 * If a class has an instance initialization 
 * block but no explicitly written constructor, 
 * will the block execute
 *  when an object is created? Prove it with code.
 */
public class Book {
	{
		System.out.println("Instance Bock");
	}
	public static void main(String[] args) {
		Book b = new Book();
	}

}
