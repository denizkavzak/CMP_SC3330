package edu.mu.logger;

public class Logger {

    private static final Logger INSTANCE =
            new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}