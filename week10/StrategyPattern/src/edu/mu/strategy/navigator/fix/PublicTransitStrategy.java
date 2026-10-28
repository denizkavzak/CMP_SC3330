package edu.mu.strategy.navigator.fix;

public class PublicTransitStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Building public transit route");
    }
}
