package edu.mu.abstractfactory.notification;

// Client
public class CommunicationService {

    private Notification notification;
    private MessageFormatter formatter;

    public CommunicationService(
            CommunicationFactory factory) {

        notification =
                factory.createNotification();

        formatter =
                factory.createFormatter();
    }

    public void send(String message) {

        String formatted =
                formatter.format(message);

        notification.send(formatted);
    }

}
