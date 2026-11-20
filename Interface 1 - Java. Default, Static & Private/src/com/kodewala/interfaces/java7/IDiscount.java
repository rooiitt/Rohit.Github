package com.kodewala.lecture.interface1;

// java 1.7 or 7 or before that.
public interface IDiscount {
	// All the variables are by Default -->  public static final --> CONSTANAT
	// public abstract will be by default in the Interface.
   public abstract  int calculateDiscount(int amount, int rate); // Abstract --> Idea a Thought or Defining the Contract
   public abstract void calculateDiscountTax(int tax);

}
class FlightBooking implements IDiscount{

	@Override
	public int calculateDiscount(int amount, int rate) {
		int finalfare = amount -(  amount * rate) / 100;
		return finalfare;
	}

	@Override
	public void calculateDiscountTax(int tax) {
		System.out.println("FlightBooking.calculateDiscountTax()");
		
	}
	public static void main(String[] args) {
		IDiscount i = new FlightBooking();
		int result = i.calculateDiscount(120, 22); 
		System.out.println(result);
	}
	
}
