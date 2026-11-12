package edu.mu.simplefactory.transport;

public class TransportFactory {

    public static Transport create(String type) {
        if (type.equals("truck")) {
            return new Truck();
        }

        if (type.equals("ship")) {
            return new Ship();
        }

        throw new IllegalArgumentException("Unknown type");
    }
}
