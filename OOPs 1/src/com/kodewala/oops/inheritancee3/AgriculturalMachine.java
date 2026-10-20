package com.kodewala.oops.inheritancee3;

public class AgriculturalMachine {
	public void startMachine() {
		System.out.println("AgriculturalMachine.startMachine() Start Machine");
		
	}

}
class Tractor extends AgriculturalMachine{
	@Override // making changes in parent class
	public void startMachine() {
		System.out.println("Tractor.startMachine() Machine Started"); 
	}
}
class FarmOperation{
	AgriculturalMachine machine;
	public FarmOperation(AgriculturalMachine machine) {
		super();
		this.machine = machine;
	}
	public void showDetaills() {
		machine.startMachine();
	}
	
	public static void main(String[] args) {
		AgriculturalMachine a = new Tractor();
		
		
		FarmOperation f = new FarmOperation(a);
		f.showDetaills();
		
		
	}
}
