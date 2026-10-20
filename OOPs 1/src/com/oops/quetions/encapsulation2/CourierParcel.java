package com.oops.quetions.encapsulation2;

//Parcel weight
public class CourierParcel {
	private double weight;

	public void setWeight(double weight) { // set method
		if (weight >= 0.1 && weight <= 20) {
			this.weight = weight;
			System.out.println("Valid weight: " + weight +"kg");
		} else {
			System.out.println("Weight is Invalid: " + weight+ "kg");

		}

	}

	public double getWeight() { // Get method
		return weight;
	}
	public static void main(String[] args) {
		CourierParcel c = new CourierParcel();
		c.setWeight(56);
		System.out.println(c.getWeight());
	}

}
