package edu.mu.inheritance.NotificationService.v2;

public class Main {

	public static void main(String[] args) {
		
        NotificationService service =
                new NotificationService();

        MessageSender email = new EmailSender();
        MessageSender sms = new SmsSender();

        service.notifyUser(
                email,
                "Your order has shipped"
        );

        service.notifyUser(
                sms,
                "Your verification code is 1234"
        );
	}

}
