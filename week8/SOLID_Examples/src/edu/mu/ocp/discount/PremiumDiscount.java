package edu.mu.ocp.discount;

public class PremiumDiscount implements DiscountPolicy {

	@Override
	public double calculateDiscount(double total) {
	return total * 0.10;
	}
}