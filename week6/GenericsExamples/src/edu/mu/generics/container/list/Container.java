package edu.mu.generics.container.list;

public class Container <T>{

	private T item;
	
	public Container(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
	
}
