package edu.mu.simplefactory.transport;

public class Main {
    
	public static void main(String[] args) {
		
		Transport transport = TransportFactory.create("truck");

		transport.deliver();
    }
}
