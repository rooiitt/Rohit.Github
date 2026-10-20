package com.kodewala.quetions;

public class Demo5 {
	int x = 10;

	{
		x = 50;
		System.out.println(x);
	}

	Demo5() {
		x = 100;
	}

	public static void main(String[] args) {
		Demo5 d = new Demo5();
		System.out.println(d.x);
	}
}
