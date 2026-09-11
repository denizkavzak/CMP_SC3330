package edu.mu.composition2;

/***
 * This version has a composition relationship
 * between OrderLine and Order, since there is a
 * whole-part relationship between them, and an
 * OrderLine object can NOT exist without/before
 * it is a part of an order. A new OrderLine 
 * object is created inside Order class only when
 * we are adding that object to the existing order.
 */
public class Main {

	public static void main(String[] args) {
		Order order = new Order();

		// order creates its own parts
        order.addItem("Laptop", 1);
        order.addItem("Mouse", 2);

        order.printOrder();

	}

}
