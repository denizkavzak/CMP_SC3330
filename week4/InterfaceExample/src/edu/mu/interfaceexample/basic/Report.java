package edu.mu.interfaceexample.basic;

public class Report implements Printable {

    @Override
    public void print() {
        System.out.println("Printing report");
    }
}
