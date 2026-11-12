package edu.mu.abstractfactory.notification;

//Campus family
public class CampusMessageFormatter implements MessageFormatter {

    @Override
    public String format(String message) {
        return "[MIZZOU] " + message;
    }

}
