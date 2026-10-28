package edu.mu.strategy.payment.fix;

public class PayPalPayment implements PaymentStrategy{

	@Override
	public void pay(double amount) {
		System.out.println("Pay with PayPal");
	}
}
