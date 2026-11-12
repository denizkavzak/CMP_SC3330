package edu.mu.notification.better;

public class NotificationService {

    public void sendNotification(String type, String message) {

        Notification notification;

        if (type.equalsIgnoreCase("email")) {
            notification = new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            notification = new SmsNotification();
        } else if (type.equalsIgnoreCase("push")) {
            notification = new PushNotification();
        } else {
            throw new IllegalArgumentException("Unknown notification type: " + type);
        }

        notification.send(message);
    }
}
