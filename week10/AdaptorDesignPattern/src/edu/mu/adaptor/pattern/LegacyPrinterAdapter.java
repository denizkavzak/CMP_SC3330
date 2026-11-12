package edu.mu.adaptor.pattern;

public class LegacyPrinterAdapter implements Printer {

    private LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(
            LegacyPrinter legacyPrinter) {

        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String text) {

        legacyPrinter.printText(text);
    }
}