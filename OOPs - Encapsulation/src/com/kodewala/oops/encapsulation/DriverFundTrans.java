package com.kodewala.oops.encapsulation;

public class DriverFundTrans {
	public static void main(String[] args) {
		FundTransfer1 f = new FundTransfer1("Rohit", "7628476287",666.0 , 678);
		f.setAmount(77);
		System.out.println("Current Balance: " + f.getBalance());
	}

}
