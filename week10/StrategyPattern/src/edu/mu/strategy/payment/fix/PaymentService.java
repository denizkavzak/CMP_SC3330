package edu.mu.strategy.payment.fix;

public class PaymentService {

	private PaymentStrategy paymentStrategy;
	
    public PaymentService(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(double amount) {
    	paymentStrategy.pay(amount);
    }
    
    public void setStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }
}
