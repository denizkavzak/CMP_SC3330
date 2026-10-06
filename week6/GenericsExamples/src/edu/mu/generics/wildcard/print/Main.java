package edu.mu.generics.wildcard.print;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		List<Integer> numbers = new ArrayList<Integer>();
		List<Dog> dogs = new ArrayList<Dog>();

		Printer.printList(names);
		Printer.printList(numbers);
		Printer.printList(dogs);
	}

}
