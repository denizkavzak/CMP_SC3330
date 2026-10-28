package edu.mu.ocp.discount;

public class EmployeeDiscount implements DiscountPolicy {

	@Override
	public double calculateDiscount(double total) {
	return total * 0.20;
	}
}
