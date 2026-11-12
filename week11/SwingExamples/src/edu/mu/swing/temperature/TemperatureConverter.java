package edu.mu.swing.temperature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TemperatureConverter {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Temperature Converter");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel inputLabel = new JLabel("Celsius:");
        inputLabel.setBounds(30, 30, 80, 25);

        JTextField inputField = new JTextField();
        inputField.setBounds(120, 30, 150, 25);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(120, 80, 100, 30);

        JLabel resultLabel = new JLabel("Fahrenheit:");
        resultLabel.setBounds(30, 130, 250, 25);

        convertButton.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        double celsius =
                                Double.parseDouble(
                                        inputField.getText());

                        double fahrenheit =
                                celsius * 9.0 / 5.0 + 32;

                        resultLabel.setText(
                                "Fahrenheit: " + fahrenheit);
                    }
                });

        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(convertButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}