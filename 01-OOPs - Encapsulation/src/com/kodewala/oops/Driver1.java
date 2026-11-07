package com.kodewala.oops;

public class Driver1 {

	public static void main(String[] args) {
		
		FundTrasfer payment = new FundTrasfer("Rohit" ,  "6827827" , 78787 , 899);
		
		payment.fundTrasfer(8980);
		System.out.println(payment.getBalance());
		
		

	}

}
