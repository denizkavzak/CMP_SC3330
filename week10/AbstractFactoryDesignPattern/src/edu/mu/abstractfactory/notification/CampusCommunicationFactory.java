package edu.mu.abstractfactory.notification;

// Concrete factory 1
public class CampusCommunicationFactory implements CommunicationFactory {

	    @Override
	    public Notification createNotification() {
	        return new CampusEmailNotification();
	    }

	    @Override
	    public MessageFormatter createFormatter() {
	        return new CampusMessageFormatter();
	    }
}
