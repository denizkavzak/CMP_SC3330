package edu.mu.DIP.notification.fix;

//Then concrete classes implement it:
class SMSSender implements MessageSender {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
