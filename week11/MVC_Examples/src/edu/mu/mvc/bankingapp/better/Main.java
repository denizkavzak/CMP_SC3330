package edu.mu.mvc.bankingapp.better;

public class Main {

	public static void main(String[] args) {
		
		BankingAppModel model = new BankingAppModel();
		BankingAppView view = new BankingAppView();
		
		BankingAppController controller = new BankingAppController(model, view);
		controller.depositButtonClicked(500);
	}

}
