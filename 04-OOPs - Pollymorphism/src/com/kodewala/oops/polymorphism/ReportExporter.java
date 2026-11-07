package com.kodewala.oops.polymorphism;

public class ReportExporter {
	public void exportReport() {
		System.out.println("ReportExporter.exportReport()...Report Exporter");
	}

}

class PDFExporter extends ReportExporter {
	public void exportReport() {
		System.out.println("PDFExporter.exportReport()......PDF Exporter");
	}
}

class ExelExporter extends ReportExporter {
	public void exportReport() {
		System.out.println("ExelExporter.exportReport().....ExelExporter");
	}
}

class CSVExporter extends ReportExporter {
	public void exportReport() {
		System.out.println("CSVExporter.exportReport()....CSVExporter");
	}
}

class ExportService {
	public void export(ReportExporter export) {
		export.exportReport();

	}
}

class ReportDriver {
	public static void main(String[] args) {
		ExportService e = new ExportService();
		
		PDFExporter p = new PDFExporter();
		ExelExporter p1 = new ExelExporter();
		CSVExporter p2 = new CSVExporter();
		
		e.export(p);
		e.export(p1);
		e.export(p2);

	}
}