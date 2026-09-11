package edu.mu.composition2.aggregation;

public class Order {
	private OrderLine[] lines;
    private int lineCount;

    public Order() {
        lines = new OrderLine[5];
        lineCount = 0;
    }
    
//    public void addItem(String productName, int quantity) {
//
//        if (lineCount < lines.length) {
//
//            OrderLine line =
//                new OrderLine(productName, quantity);
//
//            lines[lineCount] = line;
//            lineCount++;
//        }
//    }
    
    public OrderLine[] getOrderLines() {
    	return lines;
    }
    
    public int getLineCount() {
    	return lineCount;
    }
    
    public void updateLineCount() {
    	lineCount += 1;
    }

    public void printOrder() {

        for (int i = 0; i < lineCount; i++) {
            lines[i].print();
        }
    }
}
