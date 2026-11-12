package edu.mu.registry.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.mu.registry.model.User;
import edu.mu.registry.model.UserRegistry;
import edu.mu.registry.view.RegistrationWindow;

public class RegistrationController {

	private RegistrationWindow registrationWindow;
	private UserRegistry userRegistry;
	
	public RegistrationController(RegistrationWindow registrationWindow, UserRegistry userRegistry) {
		this.registrationWindow = registrationWindow;
		this.userRegistry = userRegistry;
		this.registrationWindow.addRegisterListener(new RegisterListener());
	}
	
	private class RegisterListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String name = registrationWindow.getUsername(); // view to get input
			String password = registrationWindow.getPassword(); // view to get input
			
			User user = new User(name,password);
			
			userRegistry.addUser(user); // model to add a new user
			
			registrationWindow.showMessage(name + " is registered!"); // view to output a message
			
			System.out.println(user);
			System.out.println(userRegistry.getUsers());
		}
		
	}
	
	
}
