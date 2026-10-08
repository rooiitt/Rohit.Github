package com.kodewala.switch1;

public class Ecommerce {

	public static void main(String[] args) {
		double discount = discountApi("Gold", 15000); // Command line input passing it
		System.out.println("Discount : " + discount);

	}
    // Identify the day based on the number supplied
	public static double discountApi(String customerType, double purches) {
		double discount = 0;

		if (purches > 1000) {
			switch (customerType) {
			
			case "Gold":
				discount = purches * 20 / 100;
				break;
				
			case "Silver":
				discount = purches * 10 / 100;
				break;

			case "Regular":
				discount = purches * 5 / 100;
				break;
					
			default:
				System.out.println("please enter valid customer type");
				// break;
		    }
			if (discount > 2500 ) {
				discount = 2500;
			}
			else {
				System.out.println("Minimum perches should be above 1000");
			}
		} return discount;
	}
}
