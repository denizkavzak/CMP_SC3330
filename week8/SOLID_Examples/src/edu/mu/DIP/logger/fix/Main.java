package edu.mu.DIP.logger.fix;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = new ConsoleLogger();

		ReportService service =
		    new ReportService(logger);
	}

}
