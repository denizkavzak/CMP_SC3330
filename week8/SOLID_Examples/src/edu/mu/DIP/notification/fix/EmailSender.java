package edu.mu.DIP.notification.fix;

//Then concrete classes implement it:
class EmailSender implements MessageSender {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
