package edu.mu.adaptor.pattern;

public class ReportService {

    private Printer printer;

    public ReportService(Printer printer) {
        this.printer = printer;
    }

    public void printReport(String report) {
        printer.print(report);
    }
}