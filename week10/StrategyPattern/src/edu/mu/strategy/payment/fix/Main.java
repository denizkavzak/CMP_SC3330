package edu.mu.strategy.payment.fix;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentService paymentService = new PaymentService(new CreditCardPayment());
		paymentService.checkout(100);
		
		paymentService.setStrategy(new PayPalPayment());
		paymentService.checkout(100);

		paymentService.setStrategy(new CryptoPayment());
		paymentService.checkout(100);
	}

}
