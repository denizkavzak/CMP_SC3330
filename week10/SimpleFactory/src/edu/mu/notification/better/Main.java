package edu.mu.notification.better;

public class Main {

    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.sendNotification("email", "Assignment submitted");

        service.sendNotification("sms", "Verification code: 4321");

        service.sendNotification("push", "New message available");
    }
}