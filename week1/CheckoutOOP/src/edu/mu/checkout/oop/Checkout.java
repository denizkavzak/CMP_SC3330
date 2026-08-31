package edu.mu.checkout.oop;

public class Checkout {

	public static void main(String[] args) {
		Product laptop = new Product("Laptop", 1000);
		Customer customer = new Customer(true);

		Order order = new Order(laptop, 1, customer);

		System.out.println(order.calculateTotal());

	}

}
