package com.kodewala.oops.polymorphism.downcasting;

public class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) { // Object obj = new Person ("Rohit")
		Person p = (Person) obj;
		return p.name.equals(this.name);
	}
	public static void main(String[] args) {
		Person p1 = new Person("Rohit");
		Person p2 = new Person("Manasvii");
		
		System.out.println(p1.equals(p2));

}
}
	

