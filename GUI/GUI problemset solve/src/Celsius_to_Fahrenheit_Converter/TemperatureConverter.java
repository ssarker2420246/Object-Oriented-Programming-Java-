package Celsius_to_Fahrenheit_Converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel labelCelsius = new JLabel("Celsius:");
        JTextField textFieldCelsius = new JTextField(10);

        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        JTextField textFieldFahrenheit = new JTextField(10);
        textFieldFahrenheit.setEditable(false);

        JButton btnConvert = new JButton("Convert");

        btnConvert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(textFieldCelsius.getText());
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    textFieldFahrenheit.setText(String.valueOf(fahrenheit));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid Celsius value.");
                }
            }
        });

        frame.add(labelCelsius);
        frame.add(textFieldCelsius);
        frame.add(labelFahrenheit);
        frame.add(textFieldFahrenheit);
        frame.add(btnConvert);

        frame.setVisible(true);
    }
}