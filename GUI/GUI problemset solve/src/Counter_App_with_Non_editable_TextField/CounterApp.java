package Counter_App_with_Non_editable_TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter App");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Counter");
        JTextField textField = new JTextField("0", 10);
        textField.setEditable(false);

        JButton countButton = new JButton("Count");
        JButton resetButton = new JButton("Reset");

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(textField.getText());
                value++;
                textField.setText(String.valueOf(value));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(countButton);
        frame.add(resetButton);

        frame.setVisible(true);
    }
}