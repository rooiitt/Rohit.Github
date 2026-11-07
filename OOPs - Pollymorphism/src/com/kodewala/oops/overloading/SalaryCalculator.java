package com.kodewala.oops.overloading;

public class SalaryCalculator {
	public void calculateSalary(double basicSalary) {
		System.out.println("SalaryCalculator.calculateSalary()" + basicSalary); 
	}
	public void calculateSalary(double basicSalary , double bonas) {
		System.out.println("SalaryCalculator.calculateSalary()" + basicSalary + bonas);
		
	}
	public void calculateSalary(double basicSalary , double bonas , double incentive) {
		System.out.println("SalaryCalculator.calculateSalary()"+ basicSalary + bonas + incentive);
		
	}
	public static void main(String[] args) {
		SalaryCalculator s = new SalaryCalculator();
		s.calculateSalary(12000);
		s.calculateSalary(12000, 13000);
		s.calculateSalary(12000, 13000, 400000);
	}

}

