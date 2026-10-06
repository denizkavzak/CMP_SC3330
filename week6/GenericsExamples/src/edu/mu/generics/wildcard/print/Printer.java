package edu.mu.generics.wildcard.print;

import java.util.List;

public class Printer {
	public static void printList(List<?> list) {

	    for (Object item : list) {
	        System.out.println(item);
	    }
	}
}
