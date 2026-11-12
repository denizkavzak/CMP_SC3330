package edu.mu.adaptor.nopattern;

public class LegacyPrinter implements Printer{
    public void printText(String message) {
        System.out.println("Legacy printer: " + message);
    }

	@Override
	public void print(String text) {
		printText(text);
	}
}
