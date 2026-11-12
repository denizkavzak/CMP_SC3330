package edu.mu.notification.simplefactory;

public class SmsNotification implements Notification {

    @Override
    public void send(String message) {

        System.out.println(
                "Sending EMAIL: " + message);
    }

}
