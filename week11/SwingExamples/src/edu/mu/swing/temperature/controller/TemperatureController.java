package edu.mu.swing.temperature.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.mu.swing.temperature.model.TemperatureModel;
import edu.mu.swing.temperature.view.TemperatureView;

public class TemperatureController {

    private TemperatureModel model;
    private TemperatureView view;

    public TemperatureController(TemperatureModel model, TemperatureView view) {
        this.model = model;
        this.view = view;
        this.view.addConvertListener(new ConvertListener());
    }

    private class ConvertListener
            implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            double celsius = view.getCelsius();

            double fahrenheit = model.celsiusToFahrenheit(celsius);

            view.setFahrenheit(fahrenheit);
        }
    }
}
