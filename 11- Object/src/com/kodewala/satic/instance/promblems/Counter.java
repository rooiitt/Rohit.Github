package com.kodewala.satic.instance.promblems;

public class Counter {
	static int count;{
		
	}
	{
		count++;
	}
	Counter(){
		System.out.println(count);
	}
	public static void main(String[] args) {
		Counter c = new Counter();
	}

}
