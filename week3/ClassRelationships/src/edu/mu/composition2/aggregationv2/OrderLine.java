package edu.mu.composition2.aggregationv2;

public class OrderLine {
	private String productName;
    private int quantity;

    public OrderLine(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public void print() {
        System.out.println(
            productName + " x " + quantity
        );
    }
}
