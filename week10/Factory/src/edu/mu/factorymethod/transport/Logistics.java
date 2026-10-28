package edu.mu.factorymethod.transport;

/**
 * This is the CREATOR
 * Logistics knows that it needs a Transport. 
 * It does not know which concrete transport.
 */
public abstract class Logistics {

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    protected abstract Transport createTransport();
}
