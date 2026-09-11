package edu.mu.composition2.aggregationv2;

public class Order {
	private OrderLine[] lines;
    private int lineCount;

    public Order() {
        lines = new OrderLine[5];
        lineCount = 0;
    }
    
    /**
     * addItem method takes an orderLine object
     * and adds that object to the lines array.
     * It handles the underlying data structure and 
     * logic, input validation, etc. needed.
     * @param orderLine
     */
    public void addItem(OrderLine orderLine) {
    	if(lineCount <= lines.length) {
    		lines[lineCount] = orderLine;
    		lineCount++;
    	} else{
    		System.out.println("Order cart is full");
    	}
    }
    
    public void printOrder() {

        for (int i = 0; i < lineCount; i++) {
            lines[i].print();
        }
    }
}
