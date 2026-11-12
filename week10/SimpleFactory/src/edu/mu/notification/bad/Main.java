package edu.mu.notification.bad;

public class Main {

    public static void main(String[] args) {

        NotificationService service =
                new NotificationService();

        service.sendNotification(
                "email",
                "Your assignment was graded.");

        service.sendNotification(
                "sms",
                "Your verification code is 1234.");

        service.sendNotification(
                "push",
                "You have a new announcement.");
    }
}
