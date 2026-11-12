package edu.mu.wb.example.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.mu.wb.example.model.User;
import edu.mu.wb.example.model.UserRegistry;
import edu.mu.wb.example.view.RegistrationWindow;

public class RegistrationController {

    private UserRegistry model;

    private RegistrationWindow view;

    public RegistrationController(UserRegistry model, RegistrationWindow view) {
        this.model = model;
        this.view = view;
        this.view.addRegisterListener(new RegisterListener());
    }

    private class RegisterListener
            implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String name = view.getUsername();

            String password = view.getPassword();

            User user = new User(name, password);

            model.addUser(user);

            view.showMessage(name + " is registered");

            System.out.println("All registered users:");

            System.out.println(model.getUsers());
            
        }
    }
}