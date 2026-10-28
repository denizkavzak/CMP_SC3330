package edu.mu.transport.simplefactory;

public class Main {

    public static void main(String[] args) {

        Notification notification =
                NotificationFactory.createNotification("email");

        notification.send("Your assignment was submitted.");

        Notification sms =
                NotificationFactory.createNotification("sms");

        sms.send("Your verification code is 1234");

        Notification push =
                NotificationFactory.createNotification("push");

        push.send("You have a new message.");
    }
}