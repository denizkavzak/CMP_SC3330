package edu.mu.generics.container.list;

/***
 * Container<T>
    stores one T

ContainerList<T>
    stores many Container<T> objects
 */

public class Main {

	public static void main(String[] args) {
		
		ContainerList<String> list = new ContainerList<>();
		
		Container<String> c = new Container<>("String 1");
		
		list.addContainer(c);
		
		
		list.addContainer(new Container<>("Hello"));
		list.addContainer(new Container<>("World"));
		
		//list.addContainer(new Container<>(123)); // compile-time error
		//ContainerList is a ContainerList<String>
		
		Container<String> c1 = new Container<>("Item 1");
		Container<String> c2 = new Container<>("Item 2");

		ContainerList<String> list2 = new ContainerList<>();

		list2.addContainer(c1);
		list2.addContainer(c2);
	}

}
