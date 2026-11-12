package edu.mu.notification.factorymethod;

public class SmsNotificationCreator extends NotificationCreator {

    @Override
    protected Notification createNotification() {
        return new SmsNotification();
    }

}
