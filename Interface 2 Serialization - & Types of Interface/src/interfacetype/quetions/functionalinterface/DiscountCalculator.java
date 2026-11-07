package interfacetype.quetions.functionalinterface;

public interface DiscountCalculator {
	double calculateDiscount(double price);

}
class DiscountDriver{
	public static void main(String[] args) {
		
		DiscountCalculator discount = (price) -> {
			double discountAmount = price * 10/100;
			return price - discountAmount;
				
				
			
		};
		System.out.println(discount.calculateDiscount(4000));
	}
}
