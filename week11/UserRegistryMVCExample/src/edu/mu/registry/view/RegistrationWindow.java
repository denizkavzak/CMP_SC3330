package edu.mu.registry.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.mu.registry.model.User;
import edu.mu.registry.model.UserRegistry;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrationWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	private JLabel lblMessage;
	private JButton btnRegister;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					RegistrationWindow frame = new RegistrationWindow();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public RegistrationWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(14, 37, 63, 17);
		contentPane.add(lblUsername);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(91, 34, 126, 22);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(14, 71, 61, 17);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(89, 68, 128, 22);
		contentPane.add(passwordField);
		
		//UserRegistry ur = new UserRegistry();
		
		btnRegister = new JButton("Register");
//		btnRegister.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				String name = textFieldUsername.getText();
//				String password = passwordField.getText();
//				User user = new User(name, password);
//				
//				ur.addUser(user);
//				
//				System.out.println( textFieldUsername.getText() + " is registered");
//				
//				System.out.println("all registered users are: ");
//				System.out.println(ur.getUsers());
//				
//			}
//		});
		btnRegister.setBounds(99, 119, 104, 24);
		contentPane.add(btnRegister);
		
		lblMessage = new JLabel("");
		lblMessage.setBounds(14, 161, 203, 17);
		contentPane.add(lblMessage);

	}
	
	public String getUsername() {
		return textFieldUsername.getText();
	}
	
	public String getPassword() {
		return new String(passwordField.getPassword());
	}
	
	public void showMessage(String message) {
		lblMessage.setText(message);
	}
	
	public void addRegisterListener(ActionListener listener) {
		btnRegister.addActionListener(listener);
	}
}
