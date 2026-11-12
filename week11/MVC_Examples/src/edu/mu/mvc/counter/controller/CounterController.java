package edu.mu.mvc.counter.controller;
import edu.mu.mvc.counter.model.Counter;
import edu.mu.mvc.counter.view.CounterView;

public class CounterController {

	private Counter counterModel;
	private CounterView counterView;
	
	public CounterController(Counter counter, CounterView counterView) {
		this.counterModel = counter;
		this.counterView = counterView;
	}
	
	public void increment() {
		counterModel.increment();
		counterView.displayCounter(counterModel.getIncrement());
	}
}
