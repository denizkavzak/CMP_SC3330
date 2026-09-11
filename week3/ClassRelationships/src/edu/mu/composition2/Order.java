package edu.mu.composition2;

public class Order {
	private OrderLine[] lines;
    private int lineCount;

    public Order() {
        lines = new OrderLine[5];
        lineCount = 0;
    }

    /***
     * Key difference between v2 is:
     * in v2, addItem method takes an OrderLine object
     * as a parameter. Meaning, someone else will create
     * an OrderLine object and pass it to the addItem 
     * method, which means a line can exist without an order.
     * Here, we are giving the OrderLine object creation 
     * responsibility to Order. An OrderLine object can
     * only exist after we have an Order object/in an 
     * Order object. If Order object dies, the line
     * objects in it also die.
     * @param productName
     * @param quantity
     */
    public void addItem(String productName, int quantity) {

        if (lineCount < lines.length) {

            OrderLine line =
                new OrderLine(productName, quantity);

            lines[lineCount] = line;
            lineCount++;
        }
    }

    public void printOrder() {

        for (int i = 0; i < lineCount; i++) {
            lines[i].print();
        }
    }
}
