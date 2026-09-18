package edu.mu.interfaceexample.basic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Printable p1 = new Invoice();
        Printable p2 = new Report();

        p1.print();
        p2.print();
    }
}

