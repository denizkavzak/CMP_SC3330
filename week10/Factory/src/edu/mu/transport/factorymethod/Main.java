package edu.mu.transport.factorymethod;

public class Main {

    public static void main(String[] args) {

        NotificationCreator creator =
                new EmailNotificationCreator();

        creator.notifyUser(
                "Your assignment has been graded.");

        creator = new SmsNotificationCreator();

        creator.notifyUser(
                "Your verification code is 5678.");

        creator = new PushNotificationCreator();

        creator.notifyUser(
                "New course announcement available.");
    }
}