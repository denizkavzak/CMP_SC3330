package edu.mu.wb.window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrationWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel labelPassword = new JLabel("Password:");
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationWindow frame = new RegistrationWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		
		JLabel labelUsername = new JLabel("Username:");
		labelUsername.setBounds(39, 60, 67, 17);
		contentPane.add(labelUsername);
		labelPassword.setBounds(39, 91, 85, 17);
		contentPane.add(labelPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(120, 57, 126, 22);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(120, 88, 126, 22);
		contentPane.add(textFieldPassword);
		textFieldPassword.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username =
						textFieldUsername.getText();

		        System.out.println(
		                "Registering " + username);
				
			}
		});
		
		btnRegister.setBounds(120, 154, 104, 24);
		contentPane.add(btnRegister);

	}
}
