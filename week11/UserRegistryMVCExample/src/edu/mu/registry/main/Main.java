package edu.mu.registry.main;

import edu.mu.registry.controller.RegistrationController;
import edu.mu.registry.model.UserRegistry;
import edu.mu.registry.view.RegistrationWindow;

public class Main {

	public static void main(String[] args) {
		
		RegistrationWindow registrationWindow = new RegistrationWindow();
		registrationWindow.setVisible(true);
		UserRegistry userRegistry = new UserRegistry();
		
		RegistrationController registrationController = 
				new RegistrationController(registrationWindow, userRegistry);	
	}

}
