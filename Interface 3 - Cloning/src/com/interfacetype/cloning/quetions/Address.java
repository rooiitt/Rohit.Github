package com.interfacetype.cloning.quetions;

//public class Address {
//	String city;
//}

//class Employee implements Cloneable {
//	int id;
//	String name;
//	Address address;
//
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
//
//	public static void main(String[] args) throws CloneNotSupportedException {
//		Address add = new Address();
//		add.city = "Pune";
//
//		Employee employee = new Employee();
//		employee.name = "Rohit"; //copied
//		employee.id = 101; // copied
//		employee.address = add; // HAS-A --> copy only the reference not the object. 
//		
//
//		Employee cloneemp = (Employee) employee.clone(); // cloning method
//
//		System.out.println(employee.address.city);
//		System.out.println(cloneemp.address.city);
//	}
//}
class Employee implements Cloneable {

    String name = "Rohit";

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee();

        Employee e2 = (Employee) e1.clone();

        e2.name = "Rahul";

        System.out.println(e1.name);
        System.out.println(e2.name);
        
        System.out.println(e1 == e2); // false
        System.out.println(e1.hashCode() == e2.hashCode()); //false
    }
}
