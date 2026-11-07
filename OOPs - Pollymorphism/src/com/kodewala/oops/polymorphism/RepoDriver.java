package com.kodewala.oops.polymorphism;

public class RepoDriver {
	//Overloading
	public static void main(String[] args) {
		RepoGenerator r = new RepoGenerator();
		r.generateReport(1);
		r.generateReport("XYZ");
		r.generateReport(1, "XYZ");
		
		//Overriding PDFReport
		RepoGenerator r1 = new PDFReport();
		r1.exportReport();
		
		//Overriding
		RepoGenerator r2 = new ExcelReport();
		r2.exportReport();
		
	}

}
