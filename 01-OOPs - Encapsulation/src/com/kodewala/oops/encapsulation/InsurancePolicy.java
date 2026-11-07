package com.kodewala.oops.encapsulation;

public class InsurancePolicy {
	private int coverageAmount;

	public void setCouvrageamount(int amount) {
		if (amount >= 10000 && amount <= 100000) {
			this.coverageAmount = amount;
			System.out.println("Coverage Amount IS ACCEPTED");
		} else {
			System.out.println("Invalid Coverage Amount");

		}
	}

	public int getCouvrageamount() {
		return coverageAmount;
	}
	public double calculatePremium() {
		return coverageAmount * 0.01;
	}

}
class InsureDriver{
	public static void main(String[] args) {
		InsurancePolicy i = new InsurancePolicy();
		i.setCouvrageamount(10000);
		System.out.println("Coverage Amount: " + i.getCouvrageamount());
		
		System.out.println("Premium: "+ i.calculatePremium());
	}
}
