package com.kodewala.oops.overloading;
//
//public class MoneyTransfer {
//	public void transfer(String accountnumber) {
//		System.out.println("MoneyTransfer.transfer()" + accountnumber);
//	}
//
//	public void transfer(String accountnumber, int amount) {
//		System.out.println("MoneyTransfer.transfer()" + accountnumber + " " + amount);
//	}
//
//	public void transfer(String accountnumber, int amount, String ifsccode) {
//		System.out.println("MoneyTransfer.transfer()" + accountnumber + " " + amount + " , " + ifsccode);
//	}
//
//	public static void main(String[] args) {
//		MoneyTransfer m = new MoneyTransfer();
//		m.transfer("792749239824274");
//		m.transfer("792749239824274", 60000);
//		m.transfer("792749239824274", 60000, "0037429842984");
//	}
//
//}
class Demo {
    void display(Object obj) {
        System.out.println("Object");
    }

    void display(String str) {
        System.out.println("String");
    }
    public static void main(String[] args) {
    	Demo d = new Demo();
    	d.display("Object");
    	d.display("String");
	}
}
