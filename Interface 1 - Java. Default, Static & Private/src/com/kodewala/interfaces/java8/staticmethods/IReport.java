package com.kodewala.interfaces.java8.staticmethods;
/*
 * Static Method --> cannot  Runtime Polymorphism  
 * static method does not override
 */
public interface IReport {
	String genrateReport(); //--> Instead abstract method interface

}

class PDFReport implements IReport {

	@Override
	public String genrateReport() {

		return "PDF Report Genrated";
	}

}

class ExcelReport implements IReport {

	@Override
	public String genrateReport() {

		return "Exel Report Genrated";
	}

}

class CSVReport implements IReport {

	@Override
	public String genrateReport() {

		return "CSV Report Genrated";
	}

}
class IReportDriver{
	public static void main(String[] args) {
		
		IReport report;
		
		report  = new PDFReport();
		System.out.println(report.genrateReport());
		
		report  = new ExcelReport();
		System.out.println(report.genrateReport());
		
		report  = new CSVReport();
		System.out.println(report.genrateReport());
		
		
	}
}
