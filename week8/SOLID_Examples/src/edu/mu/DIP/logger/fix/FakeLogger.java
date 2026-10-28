package edu.mu.DIP.logger.fix;

/**
 * For unit testing
 */
public class FakeLogger implements Logger{

	private boolean called;
	
	@Override
	public void log(String message) {
		called = true;
	}
	
    public boolean wasCalled() {
        return called;
    }

}
