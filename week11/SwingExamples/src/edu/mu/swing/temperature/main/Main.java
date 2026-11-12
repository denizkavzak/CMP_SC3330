package edu.mu.swing.temperature.main;

import edu.mu.swing.temperature.controller.TemperatureController;
import edu.mu.swing.temperature.model.TemperatureModel;
import edu.mu.swing.temperature.view.TemperatureView;

public class Main {

    public static void main(String[] args) {

        TemperatureModel model = new TemperatureModel();

        TemperatureView view = new TemperatureView();

        new TemperatureController(model, view);
    }
}