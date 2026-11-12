package edu.mu.swing.temperature.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TemperatureView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField inputField;
    private JButton convertButton;
    private JLabel resultLabel;

    public TemperatureView() {

        setTitle("Temperature Converter");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel inputLabel = new JLabel("Celsius:");
        inputLabel.setBounds(30, 30, 80, 25);

        inputField = new JTextField();
        inputField.setBounds(120, 30, 150, 25);

        convertButton = new JButton("Convert");
        convertButton.setBounds(120, 80, 100, 30);

        resultLabel = new JLabel("Fahrenheit:");
        resultLabel.setBounds(30, 130, 250, 25);

        add(inputLabel);
        add(inputField);
        add(convertButton);
        add(resultLabel);

        setVisible(true);
    }

    public double getCelsius() {
        return Double.parseDouble(
                inputField.getText());
    }

    public void setFahrenheit(double value) {
        resultLabel.setText(
                "Fahrenheit: " + value);
    }

    public void addConvertListener(
            ActionListener listener) {

        convertButton.addActionListener(listener);
    }
}