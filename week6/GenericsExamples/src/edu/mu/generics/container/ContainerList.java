package edu.mu.generics.container;

import java.util.ArrayList;

public class ContainerList <T>{
	
	private ArrayList<T> container;
	
	public ContainerList() {
		container = new ArrayList<T>();
	}
	
	public void addItem(T item) {
		container.add(item);
	}

	public ArrayList<T> getContainer(){
		//return container;
		return new ArrayList<>(container); // immutability of the container list
	}
	
}
