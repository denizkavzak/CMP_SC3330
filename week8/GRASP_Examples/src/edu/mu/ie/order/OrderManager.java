package edu.mu.ie.order;

public class OrderManager {
    public double calculateTotal(Order order) {
        double total = 0;

        for (OrderItem item : order.getItems()) {
            total += item.getPrice();
        }

        return total;
    }
}
