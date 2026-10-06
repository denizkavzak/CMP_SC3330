package edu.mu.generics.multibound;

public class Utility {
	
	public static <T extends Comparable<T> & Printable> T smallerAndPrint(T first, T second) {

	    T smaller;

	    if (first.compareTo(second) < 0) {
	        smaller = first;
	    } else {
	        smaller = second;
	    }

	    smaller.print();

	    return smaller;
	}
	
	public static <T extends Comparable<T> & Printable> void process(T item) {
	    item.print();
	}
}
