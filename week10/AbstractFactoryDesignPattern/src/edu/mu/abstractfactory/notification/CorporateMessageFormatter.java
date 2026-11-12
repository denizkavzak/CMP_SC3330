package edu.mu.abstractfactory.notification;

// Corporate family
public class CorporateMessageFormatter implements MessageFormatter {

    @Override
    public String format(String message) {
        return "[CORPORATE] " + message;
    }

}
