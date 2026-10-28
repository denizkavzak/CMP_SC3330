package edu.mu.strategy.navigator.fix;

public class Main {

	public static void main(String[] args) {
		
		Navigator navigator = new Navigator(new WalkingStrategy());
		navigator.buildRoute("Campus", "Downtown");
		
		navigator.setStrategy(new DrivingStrategy());
		navigator.buildRoute("Campus", "Downtown");

		navigator.setStrategy(new WalkingStrategy());
		navigator.buildRoute("Campus", "Downtown");

	}

}
