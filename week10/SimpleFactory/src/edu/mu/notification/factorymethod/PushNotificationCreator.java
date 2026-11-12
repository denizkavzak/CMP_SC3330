package edu.mu.notification.factorymethod;

public class PushNotificationCreator extends NotificationCreator {

    @Override
    protected Notification createNotification() {
        return new PushNotification();
    }

}
