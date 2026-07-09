package Button_Checks_and_Unchecks_CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxButtonApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox App");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox("Select");
        JButton button = new JButton("Check");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    checkBox.setSelected(false);
                    button.setText("Check");
                } else {
                    checkBox.setSelected(true);
                    button.setText("UnCheck");
                }
            }
        });

        frame.add(checkBox);
        frame.add(button);

        frame.setVisible(true);
    }
}