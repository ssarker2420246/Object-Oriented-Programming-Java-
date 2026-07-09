package Button_Click_Shows_Message_Dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageDialogApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Message App");
        frame.setSize(250, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Alice in OOP Land", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.add(button);

        frame.setVisible(true);
    }
}