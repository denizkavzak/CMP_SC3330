package edu.mu.DIP.logger.fix;

public class ReportService {
    private Logger logger;

    public ReportService(Logger logger) {
        this.logger = logger;
    }

    public void generateReport() {
        logger.log("Report generated");
    }
}
