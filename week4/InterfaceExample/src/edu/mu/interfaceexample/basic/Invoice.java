package edu.mu.interfaceexample.basic;

public class Invoice implements Printable {

    @Override
    public void print() {
        System.out.println("Printing invoice");
    }
}
