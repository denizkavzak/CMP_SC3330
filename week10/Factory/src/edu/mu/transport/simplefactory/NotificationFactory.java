package edu.mu.transport.simplefactory;

public class NotificationFactory {

    public static Notification createNotification(String type) {

        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException(
                    "Notification type cannot be blank");
        }

        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }

        if (type.equalsIgnoreCase("sms")) {
            return new SmsNotification();
        }

        if (type.equalsIgnoreCase("push")) {
            return new PushNotification();
        }

        throw new IllegalArgumentException(
                "Unknown notification type: " + type);
    }
}
