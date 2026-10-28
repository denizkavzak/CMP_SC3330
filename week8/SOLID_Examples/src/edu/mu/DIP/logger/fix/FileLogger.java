package edu.mu.DIP.logger.fix;

public class FileLogger implements Logger {
	
	private boolean called;
	
    @Override
    public void log(String message) {
    	called = true;
        System.out.println("File: " + message);
    }
    
    public boolean wasCalled() {
        return called;
    }
}
