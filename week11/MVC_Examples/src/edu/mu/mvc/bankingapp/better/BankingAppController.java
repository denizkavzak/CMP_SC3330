package edu.mu.mvc.bankingapp.better;

public class BankingAppController {
	
	BankingAppModel model;
	BankingAppView view;
	
	public BankingAppController(BankingAppModel model, BankingAppView view) {
		this.model = model;
		this.view = view;
	}
	
	public void depositButtonClicked(double amount) {
		model.deposit(amount);
		view.depositButtonClicked(model.getBalance());
    }
	
}
