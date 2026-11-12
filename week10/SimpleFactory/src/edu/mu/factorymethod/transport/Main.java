package edu.mu.factorymethod.transport;

/**
 * “Who creates the Truck?”
 * 	RoadLogistics.
 * “Does the base Logistics class know about Truck?”
 * 	No.
 * “What does createTransport() return?”
 * The abstraction, Transport.
 */
public class Main {

	public static void main(String[] args) {
		
		Logistics logistics = new RoadLogistics();
		logistics.planDelivery();
	}

}
