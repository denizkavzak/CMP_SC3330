package edu.mu.composition2.aggregationv2;

/***
 * This version has an aggregation relationship
 * between OrderLine and Order, since there is a
 * whole-part relationship between them, and an
 * OrderLine object can still exists without/before
 * it is a part of an order.
 * 
 * In v2: There is a method provided by order to add a 
 * new OrderLine object to the order. v2
 * moved the implementation details and logic
 * of adding a line to an order into a method
 * provided by Order class (addItem method).
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		
		// parts are created and added to the whole later
		OrderLine orderLine1 = new OrderLine("Laptop", 1);
		OrderLine orderLine2 = new OrderLine("Mouse", 2);
		
		order.addItem(orderLine1);
		order.addItem(orderLine2);

        order.printOrder();
	}

}
