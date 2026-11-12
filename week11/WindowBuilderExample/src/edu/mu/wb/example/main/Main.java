package edu.mu.wb.example.main;

import java.awt.EventQueue;

import edu.mu.wb.example.controller.RegistrationController;
import edu.mu.wb.example.model.UserRegistry;
import edu.mu.wb.example.view.RegistrationWindow;

public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(
                new Runnable() {

            @Override
            public void run() {

                UserRegistry model = new UserRegistry();

                RegistrationWindow view = new RegistrationWindow();

                new RegistrationController(model, view);

                view.setVisible(true);
            }
        });
    }
}