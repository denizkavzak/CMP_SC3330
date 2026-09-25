package edu.mu.inheritance.NotificationService.v2;

/***
 * The service depends on the interface
 */
public class NotificationService {

    public void notifyUser(
            MessageSender notification,
            String message) {

        notification.send(message);
    }
}