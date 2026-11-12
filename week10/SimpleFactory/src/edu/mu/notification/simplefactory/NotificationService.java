package edu.mu.notification.simplefactory;

public class NotificationService {

    public void sendNotification(String type, String message) {

        Notification notification = NotificationFactory.createNotification(type);
        
        notification.send(message);
    }
}
