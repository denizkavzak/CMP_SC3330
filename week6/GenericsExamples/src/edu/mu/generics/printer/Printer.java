package edu.mu.generics.printer;

public class Printer {
	
    public <T> void printItem(T item) {
        System.out.println(item);
    }
    
    public static <T> void printItemS(T item) {
        System.out.println(item);
    }
}
