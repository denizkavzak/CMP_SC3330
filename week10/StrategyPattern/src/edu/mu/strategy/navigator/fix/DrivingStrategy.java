package edu.mu.strategy.navigator.fix;

public class DrivingStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Building driving route");
    }
}
