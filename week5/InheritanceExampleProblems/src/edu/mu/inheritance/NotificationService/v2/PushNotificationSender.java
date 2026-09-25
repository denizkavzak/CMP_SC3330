package edu.mu.inheritance.NotificationService.v2;

public class PushNotificationSender implements MessageSender {

    @Override
    public void send(String message) {
        System.out.println(
            "Sending push notification: " + message
        );
    }
}
