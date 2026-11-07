package com.kodewala.solidprinciple;

public class DriverRepo {
	public static void main(String[] args) {
		ExportService e = new ExportService();
		
		PDFExporter p = new PDFExporter(); // Calling the PDFExporter Object
		e.export(p);
		
		ExcelExporter p1 = new ExcelExporter(); // Calling the ExcelExporter Object
		e.export(p1);
		
		CSVExporter p3 = new CSVExporter(); //  Calling the ExcelExporter Object
		e.export(p3);
		
	}

}
