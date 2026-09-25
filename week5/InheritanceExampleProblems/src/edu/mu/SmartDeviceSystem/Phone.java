package edu.mu.SmartDeviceSystem;

public class Phone implements Rechargable, Connectable{

    @Override
    public void recharge() {
        System.out.println("Charging phone");
    }

    @Override
    public void connect() {
        System.out.println("Connecting phone");
    }

}
