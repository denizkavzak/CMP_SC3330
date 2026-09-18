package edu.mu.polymorphism.conditional_v2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor processor = new PaymentProcessor();

		processor.processPayment(
		    new CreditCardPayment(),
		    50.0
		);

		processor.processPayment(
		    new PayPalPayment(),
		    75.0
		);
	}

}
