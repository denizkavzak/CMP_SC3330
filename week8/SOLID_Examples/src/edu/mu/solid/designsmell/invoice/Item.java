package edu.mu.solid.designsmell.invoice;

public class Item {

	int ID;
	String name;
	double price;
	
	public Item(int ID, String name, double price) {
		this.ID = ID;
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Item ID: " + this.ID + ". Item name: " + this.name + ". Item price: " + this.price;
	}
}

