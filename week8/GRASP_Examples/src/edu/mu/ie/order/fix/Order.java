package edu.mu.ie.order.fix;

import java.util.List;

public class Order {

    private List<OrderItem> items;

    public double calculateTotal() { // The data and behavior stay together.

        double total = 0;

        for (OrderItem item : items) {
            total += item.getPrice();
        }

        return total;
    }
}
