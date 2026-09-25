package edu.mu.inheritance.NotificationService.v2;

public class SmsSender implements MessageSender{

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS: " + message);
	}

}
