package edu.mu.mvc.counter.controller;

import edu.mu.mvc.counter.model.Counter;
import edu.mu.mvc.counter.view.CounterView;

public class Main {

	public static void main(String[] args) {
		
		Counter counterModel = new Counter();
		CounterView counterView = new CounterView();
		
		CounterController controller = 
				new CounterController(counterModel, counterView);
		
		controller.increment();
		controller.increment();
		controller.increment();
	}

}
