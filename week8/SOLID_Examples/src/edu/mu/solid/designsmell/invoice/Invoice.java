package edu.mu.solid.designsmell.invoice;

import java.util.ArrayList;

public class Invoice {
	
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
    public double calculateTotal() {
        double total = 0;
        
    	for(Item item : items) {
        	total += item.getPrice();
        }
    	
    	return total;
    }
}
