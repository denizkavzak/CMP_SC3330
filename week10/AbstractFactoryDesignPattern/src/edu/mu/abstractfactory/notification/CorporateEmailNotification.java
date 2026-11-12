package edu.mu.abstractfactory.notification;

// Corporate family
public class CorporateEmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println(
                "Corporate Email -> " + message);
    }

}
