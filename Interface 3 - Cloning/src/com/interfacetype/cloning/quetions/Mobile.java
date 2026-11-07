package com.interfacetype.cloning.quetions;

class Mobile {
	int price;
}

class Customer implements Cloneable {
	String name;
	Mobile mobile;

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Mobile mobile = new Mobile();
		mobile.price = 80000;
		
		Customer customer1 = new Customer();
		customer1.name = "Rohit";
		
		Customer customer2 = (Customer) customer1.clone();
		
		customer1.name = "Rahul";
		System.out.println(customer2.name);
		System.out.println(customer1.name);
		
		
	}
}