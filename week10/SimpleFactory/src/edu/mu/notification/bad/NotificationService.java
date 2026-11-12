package edu.mu.notification.bad;

public class NotificationService {

    public void sendNotification(
            String type,
            String message) {

        if (type.equalsIgnoreCase("email")) {

            System.out.println(
                    "Sending EMAIL: " + message);

        } else if (type.equalsIgnoreCase("sms")) {

            System.out.println(
                    "Sending SMS: " + message);

        } else if (type.equalsIgnoreCase("push")) {

            System.out.println(
                    "Sending PUSH notification: " + message);

        } else {

            throw new IllegalArgumentException(
                    "Unknown notification type: " + type);
        }
    }
}
