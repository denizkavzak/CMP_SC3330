package edu.mu.adaptor.pattern;

public class Main {
	public static void main(String[] args) {
		
		ReportService rs = 
				new ReportService(
						new LegacyPrinterAdapter(new LegacyPrinter()));
		rs.printReport("Report message");
//        LegacyPrinter oldPrinter =
//                new LegacyPrinter();
//
//        Printer adapter =
//                new LegacyPrinterAdapter(oldPrinter);
//
//        ReportService service =
//                new ReportService(adapter);
//
//        service.printReport(
//                "Quarterly report");
    }
}
