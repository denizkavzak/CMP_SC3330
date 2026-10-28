package edu.mu.ocp.discount;

public class TicketManager {
	public double calculateDiscount(String customerType, double total) {

	    if (customerType.equals("REGULAR")) {
	        return 0;
	    }
	    else if (customerType.equals("PREMIUM")) {
	        return total * 0.10;
	    }
	    else if (customerType.equals("EMPLOYEE")) {
	        return total * 0.20;
	    }

	    return 0;
	}
	
	
	public double checkout(DiscountPolicy policy, double total) {

	    return total - policy.calculateDiscount(total);
	}
}
