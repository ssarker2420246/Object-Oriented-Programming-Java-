package Ocean_Array_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUITest {
    public static void main(String[] args) {
        JFrame f = new JFrame("Ocean App");
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        String[] oceans = {
                "Arctic",
                "North Atlantic",
                "South Atlantic",
                "Indian",
                "North Pacific",
                "South Pacific",
                "Antarctic"
        };

        JTextField tf1 = new JTextField(20);
        JTextField tf2 = new JTextField(20);
        JButton showButton = new JButton("Show");

        tf2.setEditable(false);

        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int index = Integer.parseInt(tf1.getText());

                    if (index >= 0 && index <= 6) {
                        tf2.setText(oceans[index]);
                    } else {
                        JOptionPane.showMessageDialog(f, "Index must be between 0 and 6.");
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Please enter a valid index number.");
                }
            }
        });

        f.add(tf1);
        f.add(tf2);
        f.add(showButton);

        f.setVisible(true);
    }
}