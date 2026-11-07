package com.kodewala.oops.polymorphism;
/*
 * Using both Overloading and Overriding
 */

public class RepoGenerator {
	
	//Overloading 1
	public void generateReport(int repoID) {
		System.out.println("RepoGenerator.generateReport().....Report ID");
	}
	//Overloading 1
	public void generateReport(String reportName) {
		System.out.println("RepoGenerator.generateReport()......Report Name ");

	}
	//Overloading 1
	public void generateReport(int repoID, String reportName) {
		System.out.println("RepoGenerator.generateReport().......ReportID & ReportName");
	}
    //Common method for overriding
	public void exportReport() {
		System.out.println("RepoGenerator.exportReport()......Export Report");
	}

}

class PDFReport extends RepoGenerator {
	@Override
	public void exportReport() {
		System.out.println("PDFReport.exportReport().......Export Report as PDF");
	}
}
class ExcelReport extends RepoGenerator {
	@Override
	public void exportReport() {
		System.out.println("ExcelReport.exportReport().....Export Report as Exel");
	}
}
