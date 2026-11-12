package edu.mu.notification.factorymethod;

public class EmailNotificationCreator extends NotificationCreator {

    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }

}
