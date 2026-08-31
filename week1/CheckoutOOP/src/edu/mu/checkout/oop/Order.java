package edu.mu.checkout.oop;

public class Order {

    private Product product;
    private int quantity;
    private Customer customer;

    public Order(Product product, int quantity, Customer customer) {
        this.product = product;
        this.quantity = quantity;
        this.customer = customer;
    }

    public double calculateSubtotal() {
        return product.getPrice() * quantity;
    }

    public double calculateTotal() {
        double subtotal = calculateSubtotal();

        double discount = 0;

        if (customer.isPremium()) {
            discount = subtotal * 0.10;
        }

        double taxableAmount = subtotal - discount;
        double tax = taxableAmount * 0.08;

        return taxableAmount + tax;
    }
}