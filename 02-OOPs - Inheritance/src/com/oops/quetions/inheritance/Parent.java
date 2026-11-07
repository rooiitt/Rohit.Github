package com.oops.quetions.inheritance;

//Parent has a parameterized constructor
public class Parent {
	Parent(int x) {
		System.out.println(x);
	}
}

class Child extends Parent {
	Child() {
		super(7); // this() and super () must be there 
		System.out.println("Child");
	}
}

class Main {
	public static void main(String[] args) {
		Child c = new Child();
	}
}
