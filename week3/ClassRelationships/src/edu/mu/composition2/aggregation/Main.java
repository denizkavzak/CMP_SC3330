package edu.mu.composition2.aggregation;

/***
 * This version has an aggregation relationship
 * between OrderLine and Order, since there is a
 * whole-part relationship between them, and an
 * OrderLine object can still exists without/before
 * it is a part of an order.
 * There is no method provided by order to add a 
 * new OrderLine object to the order. 
 * Get/set methods are provided by Order class
 * and are used to add a new line to the order.
 * Bad encapsulation/design example. v2 will 
 * move the implementation details and logic
 * of adding a line to an order into a method
 * provided by Order class.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		
		// parts are created and added to the whole later
		OrderLine orderLine1 = new OrderLine("Laptop", 1);
		OrderLine orderLine2 = new OrderLine("Mouse", 2);
		
		if(order.getLineCount() < order.getOrderLines().length) {
			order.getOrderLines()[order.getLineCount()] = orderLine1;
			order.updateLineCount();
		}
		
		if(order.getLineCount() < order.getOrderLines().length) {
			order.getOrderLines()[order.getLineCount()] = orderLine2;
			order.updateLineCount();
		}

        order.printOrder();
	}

}
