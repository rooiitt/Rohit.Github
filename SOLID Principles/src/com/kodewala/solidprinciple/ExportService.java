package com.kodewala.solidprinciple;

/*
 * here we are usingg Polymorphism
 */
public class ExportService {
	public void export(ReportExporter export) {
		export.exportReport(); // Polymorphism
	}

}
