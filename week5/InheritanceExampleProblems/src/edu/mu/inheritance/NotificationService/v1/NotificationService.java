package edu.mu.inheritance.NotificationService.v1;

public class NotificationService {
    public void send(String type, String message) {

        if (type.equals("EMAIL")) {
            System.out.println("Sending email: " + message);
        }
        else if (type.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        }
    }
}
