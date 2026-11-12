package edu.mu.mvc.registration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationController {

    private UserModel userModel;
    private UserView userView;

    public RegistrationController(
            UserModel userModel,
            UserView userView) {

        this.userModel = userModel;
        this.userView = userView;

        this.userView.addRegisterListener(
                new RegisterListener());
    }

    class RegisterListener
            implements ActionListener {

        @Override
        public void actionPerformed(
                ActionEvent event) {

            String username =
                    userView.getUsername();

            String password =
                    userView.getPassword();

            userModel.setUsername(username);
            userModel.setPassword(password);

            userView.showMessage(
                    "Registered user: "
                    + userModel.getUsername());
        }
    }
}
