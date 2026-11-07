package com.kodewala.oops.abstarction1;

abstract class Car {
	void start() {
		System.out.println("Car.start()...Car Started");
	}

	abstract void accelaration();

	abstract void brake();

}

class FuelCar extends Car {
	@Override
	void accelaration() {
		System.out.println("FuelCar.accelaration()....Fule Car Accelarating");

	}

	void brake() {
		System.out.println("FuelCar.brake().....Fuel Car Break");

	}

}

class ElectricCar extends Car {
	@Override
	void accelaration() {
		System.out.println("ElectricCar.accelaration()....Electric Car Accelarating");

	}

	void brake() {
		System.out.println("ElectricCar.brake() Electric Car Brake");

	}

}
class CarDriver{
	public static void main(String[] args) {
		Car c = new FuelCar();
		c.start();
		c.accelaration();
		c.brake();
	}
}
