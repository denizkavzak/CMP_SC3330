package edu.mu.abstractfactory.notification;

// Concrete factory 1
public class CorporateCommunicationFactory implements CommunicationFactory {

    @Override
    public Notification createNotification() {
        return new CorporateEmailNotification();
    }

    @Override
    public MessageFormatter createFormatter() {
        return new CorporateMessageFormatter();
    }

}
