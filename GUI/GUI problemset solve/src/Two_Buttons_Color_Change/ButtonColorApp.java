package Two_Buttons_Color_Change;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonColorApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Color App");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        button1.setBackground(Color.RED);
        button2.setBackground(Color.BLUE);

        button1.setOpaque(true);
        button2.setOpaque(true);

        button1.setBorderPainted(false);
        button2.setBorderPainted(false);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button1.getBackground().equals(Color.RED)) {
                    button1.setBackground(Color.GREEN);
                } else {
                    button1.setBackground(Color.RED);
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button2.getBackground().equals(Color.BLUE)) {
                    button2.setBackground(Color.CYAN);
                } else {
                    button2.setBackground(Color.BLUE);
                }
            }
        });

        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);
    }
}