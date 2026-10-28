package edu.mu.messy;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items;
    private Customer customer;

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
    
    public Customer getCustomer() {
    	return customer;
    }
}
