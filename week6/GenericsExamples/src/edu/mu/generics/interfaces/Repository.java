package edu.mu.generics.interfaces;

public interface Repository <T>{
	void add(T item);
	
	T findByID(int id);
}
