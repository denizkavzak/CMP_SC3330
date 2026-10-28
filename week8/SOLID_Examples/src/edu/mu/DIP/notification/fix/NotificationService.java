package edu.mu.DIP.notification.fix;

// Now the high-level class depends only on the interface:
// constructor injection.
class NotificationService {
    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String message) {
        sender.send(message);
    }
}