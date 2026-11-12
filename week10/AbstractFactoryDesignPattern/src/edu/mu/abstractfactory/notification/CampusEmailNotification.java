package edu.mu.abstractfactory.notification;

// Campus family
public class CampusEmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println(
                "Campus Email -> " + message);
    }
}

