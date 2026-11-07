package com.kodewala.oops.overloading;

public class Client {
	public static void main(String[] args) {
		
		Login l = new Login();
		l.doLogin("@gmail.com");
		l.doLogin("Iphone 15", 1232);
		l.doLogin("@gmail.com", "rohit@#@!");// this will call from the main account the changes here will not,
		               // be occur 
		
	}

}
//class Discount {
//    void calculate(int price) {
//        System.out.println("int");
//    }
//
//    void calculate(double price) {
//        System.out.println("double");
//    }
//
//    public static void main(String[] args) {
//        Discount d = new Discount();
//        byte price = 50; //-127 to 128 in a range it can execute
//        d.calculate(price);
//    }
//}
/*
 * Output: Compilation error. (Ambiguous merhod)
 * 
 * send(String address) → accepts null 
 * send(Integer pincode) → also accepts null 
 */
class Report {
    void generate(int value) {
        System.out.println("int");
    }

    void generate(int... values) {
        System.out.println("varargs");
    }

    public static void main(String[] args) {
        Report r = new Report();
        r.generate(10);
        r.generate(10, 20); // multiple int will give varargs
    }
}