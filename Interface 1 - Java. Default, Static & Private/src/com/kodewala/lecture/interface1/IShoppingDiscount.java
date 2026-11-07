package com.kodewala.lecture.interface1;
/*
 *  Sale Price = Original Price − (Original Price × Discount Percentage).
 */

public interface IShoppingDiscount {
	int calculateDiscount(int price, int rate);
	void displayOffer();

}
class OnlineShoping implements IShoppingDiscount{

	@Override
	public int calculateDiscount(int price, int rate) {
		int discount = (price * rate)/100;
		return discount;
	}

	@Override
	public void displayOffer() {
		System.out.println("Festival offer applied");
		
	}
	
}
class IshoppingDriver{
	public static void main(String[] args) {
		IShoppingDiscount i = new OnlineShoping();
		int discount = i.calculateDiscount(130, 44);
		System.out.println(discount);
		i.displayOffer();
		
	}
}
