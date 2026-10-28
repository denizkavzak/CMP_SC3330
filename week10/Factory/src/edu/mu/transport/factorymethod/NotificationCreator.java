package edu.mu.transport.factorymethod;

public abstract class NotificationCreator {

    public void notifyUser(String message) {

        Notification notification = createNotification();

        notification.send(message);
    }

    protected abstract Notification createNotification();
}
