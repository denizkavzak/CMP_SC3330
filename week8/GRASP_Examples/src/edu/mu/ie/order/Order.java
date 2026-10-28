package edu.mu.ie.order;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderItem> items;

    public double calculateTotal() {

        double total = 0;

        for (OrderItem item : items) {
            total += item.getPrice();
        }

        return total;
    }
    
    public List<OrderItem> getItems(){
    	return new ArrayList<OrderItem> (items);
    }
}
