package edu.mu.SmartDeviceSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rechargable[] devices = {
			    new Phone(),
			    new ElectricCar()
			};

			for (Rechargable device : devices) {
			    device.recharge();
			}
	}

}
