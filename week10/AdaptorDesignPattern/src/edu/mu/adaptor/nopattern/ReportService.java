package edu.mu.adaptor.nopattern;

public class ReportService {

    private Printer printer;

    public ReportService(Printer printer) {
        this.printer = printer;
    }

    public void printReport(String report) {
        printer.print(report);
    }
}