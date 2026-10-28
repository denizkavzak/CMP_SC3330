package edu.mu.DIP.logger;

public class ReportService {

    private FileLogger logger = new FileLogger();

    public void generateReport() {
        logger.log("Report generated");
    }
}