package edu.mu.abstractclass.basic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = {
			    new Circle(2),
			    new Rectangle(3, 4)
			};

		for (Shape shape : shapes) {
		    shape.printArea();
		}
	}

}
