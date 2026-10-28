package edu.mu.strategy.payment.fix;

public class CryptoPayment implements PaymentStrategy{

	@Override
	public void pay(double amount) {
		System.out.println("Pay with Crypto");
	}

}
