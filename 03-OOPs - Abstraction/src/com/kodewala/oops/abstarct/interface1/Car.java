package com.kodewala.oops.abstarct.interface1;

//in interface all classes will be public we can't narow it down must be widen
interface Car { 
	void start();

	void acceleratin();

	void braak();

}
class Fuel implements Car{
	@Override
	public void start() {
		System.out.println("FuelCar.start()....Fuel Car Started");
	}

	@Override
	public void acceleratin() {
		System.out.println("Fuel.acceleratin()....Fuel Car Accelaration");
		
	}

	@Override
	public void braak() {
		System.out.println("Fuel.braak()....Fuel Car Break");
		
	}
}
class Electric implements Car{

	@Override
	public void start() {
		System.out.println("Electric.start().....Electric Car Started");
		
	}

	@Override
	public void acceleratin() {
		System.out.println("Electric.acceleratin()....Electric Car Accelaration");
		
	}

	@Override
	public void braak() {
		System.out.println("Electric.braak()......Electric Car Break");
		
	}
	
}
class DriverCar{
	public static void main(String[] args) {
		Car c = new Fuel();
		c.start();
		c.acceleratin();
		c.braak();
	}
}