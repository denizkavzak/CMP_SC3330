package edu.mu.strategy.navigator.fix;

public class WalkingStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Building walking route");
    }
}
