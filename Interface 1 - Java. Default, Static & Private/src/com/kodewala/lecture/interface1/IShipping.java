package com.kodewala.lecture.interface1;

public interface IShipping {
	double calculateCost(double weight);

}
class StandardShipping implements IShipping {

	@Override
	public double calculateCost(double weight) {
		double standerd = weight * 40; // 	Logic 
		return standerd;
	}
	
}
class ExpressShipping implements IShipping{

	@Override
	public double calculateCost(double weight) {
		double express = weight * 70;
		return express;
	}
	
}
class IShipingDriver{
	public static void main(String[] args) {
		IShipping i = new StandardShipping();
		IShipping i1 = new ExpressShipping();
		
		double standerd = i.calculateCost(20);
		System.out.println(standerd);
		
		double express = i1.calculateCost(30);
		System.out.println(express);
		
	}
}