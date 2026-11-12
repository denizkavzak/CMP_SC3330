package edu.mu.notification.factorymethod;

public class PushNotification implements Notification {

    @Override
    public void send(String message) {

        System.out.println(
                "Sending PUSH: " + message);
    }

}
