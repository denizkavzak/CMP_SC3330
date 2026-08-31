package edu.mu.checkout.procedural;

/***
 * Checkout/order calculation class
 */
public class Checkout {

	public static double calculateTotal(
			double price,
			int quantity,
			boolean premiumCustomer,
			boolean hasCoupon) {
		double subtotal = price * quantity;

        double discount = 0;

        if (premiumCustomer) {
            discount += subtotal * 0.10;
        }

        if (hasCoupon) {
            discount += 5.00;
        }

        double tax = (subtotal - discount) * 0.08;

        return subtotal - discount + tax;
	}
	
	public static void main(String[] args) {
		double total =
                calculateTotal(20.0, 3, true, true);

        System.out.println(total);

	}

}
