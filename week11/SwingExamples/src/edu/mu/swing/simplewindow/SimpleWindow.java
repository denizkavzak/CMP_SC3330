package edu.mu.swing.simplewindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleWindow {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Form");

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        JLabel label =
                new JLabel("Name:");

        label.setBounds(30, 30, 80, 25);

        JTextField nameField =
                new JTextField();

        nameField.setBounds(120, 30, 200, 25);

        JButton button =
                new JButton("Submit");

        button.setBounds(120, 80, 100, 30);

        frame.add(label);
        frame.add(nameField);
        frame.add(button);
        
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String name =
                        nameField.getText();

                System.out.println(
                        "Hello " + name);
            }
        });
        
        
//        button.addActionListener(e -> {
//
//            String name = nameField.getText();
//
//            System.out.println(
//                    "Hello " + name);
//        });

        frame.setVisible(true);
    }
    
}