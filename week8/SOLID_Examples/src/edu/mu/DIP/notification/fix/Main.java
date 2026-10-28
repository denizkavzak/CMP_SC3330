package edu.mu.DIP.notification.fix;

public class Main {

	public static void main(String[] args) {
		MessageSender sender = new EmailSender();
		NotificationService service =
		        new NotificationService(sender);
		
		NotificationService service2 =
		        new NotificationService(new SMSSender());
		
	}

}
