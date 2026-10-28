package edu.mu.notification.better;

public class EmailNotification implements Notification {

	@Override
	public void send(String message) {

		System.out.println("Sending EMAIL: " + message);
	}
}
