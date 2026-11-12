package edu.mu.mvc.registration;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserView extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public UserView() {

        setTitle("User Registration");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel usernameLabel =
                new JLabel("Username:");

        usernameLabel.setBounds(30, 30, 80, 25);
        add(usernameLabel);

        usernameField =
                new JTextField();

        usernameField.setBounds(120, 30, 170, 25);
        add(usernameField);

        JLabel passwordLabel =
                new JLabel("Password:");

        passwordLabel.setBounds(30, 70, 80, 25);
        add(passwordLabel);

        passwordField =
                new JPasswordField();

        passwordField.setBounds(120, 70, 170, 25);
        add(passwordField);

        registerButton =
                new JButton("Register");

        registerButton.setBounds(110, 120, 110, 30);
        add(registerButton);

        setVisible(true);
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(
                passwordField.getPassword());
    }

    public void addRegisterListener(
            ActionListener listener) {

        registerButton.addActionListener(listener);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}