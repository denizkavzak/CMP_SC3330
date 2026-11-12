package edu.mu.adaptor.nopattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Printer legacyPrinter = new LegacyPrinter();
		ReportService rs = 
				new ReportService(new LegacyPrinter());
		rs.printReport("Report message");	
	}

}
