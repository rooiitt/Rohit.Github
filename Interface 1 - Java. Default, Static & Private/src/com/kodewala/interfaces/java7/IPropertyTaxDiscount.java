package com.kodewala.lecture.interface1;

/*
 * All three methods are called 'cause of the i we implement here and two from the IDiscount 
 */

public interface IPropertyTaxDiscount extends IDiscount {
	public abstract void calculatePropDisc();

}
class PropertyTax implements  IPropertyTaxDiscount{

	@Override
	public int calculateDiscount(int amount, int rate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void calculateDiscountTax(int tax) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatePropDisc() {
		// TODO Auto-generated method stub
		
	}
	
}
