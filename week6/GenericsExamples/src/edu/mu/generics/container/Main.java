package edu.mu.generics.container;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ContainerList<String> items = new ContainerList<>();
		
		items.addItem("Item 1");
		items.addItem("Item 2");
		
		for (String item : items.getContainer()) {
		    System.out.println(item);
		}
		
		ContainerList<Integer> numbers =
		        new ContainerList<>();

		numbers.addItem(10);
		numbers.addItem(20);

		for (Integer number : numbers.getContainer()) {
		    System.out.println(number);
		}
		
		System.out.println(first(numbers.getContainer()));
		
		//ContainerList<Student> students = new ContainerList<>();

	}

	public static <T> T first(ArrayList<T> list) {
		return list.get(0);			
	}

}
