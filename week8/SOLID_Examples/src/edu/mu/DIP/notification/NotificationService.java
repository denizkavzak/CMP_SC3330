package edu.mu.DIP.notification;

public class NotificationService {

	private EmailSender sender = new EmailSender();
	
	public void notifyUser(String message) {
		sender.send(message);
	}
	
}
