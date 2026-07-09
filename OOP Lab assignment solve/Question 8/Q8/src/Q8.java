import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q8 implements ActionListener {

    JTextField textFieldCelsius;
    JTextField textFieldFahrenheit;
    JButton btnConvert;

    public static void main(String[] args) {

        Q8 main = new Q8();

        JFrame frame = new JFrame("CtoF converter");
        frame.setSize(500,220);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setSize(500,320);
        panel.setLayout(null);

        JLabel C = new JLabel("Enter Celsius Value: ");
        C.setBounds(48,25,185,25);
        panel.add(C);

        JLabel F = new JLabel("Fahrenheit value: ");
        F.setBounds(60,85,165,25);
        panel.add(F);

        main.textFieldCelsius = new JTextField();
        main.textFieldCelsius.setBounds(170,25,150,20);
        panel.add(main.textFieldCelsius);

        main.textFieldFahrenheit = new JTextField();
        main.textFieldFahrenheit.setBounds(170,85,150,20);
        panel.add(main.textFieldFahrenheit);

        main.btnConvert = new JButton("Convert to Fahrenheit");
        main.btnConvert.setBounds(80,55,180,20);
        main.btnConvert.setFocusable(false);
        main.btnConvert.addActionListener(main);
        panel.add(main.btnConvert);

        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed (ActionEvent eR) {
        Object source = eR.getSource();

        try {
            String input = textFieldCelsius.getText();
            double output;

            if (source == btnConvert){
                if (input.isEmpty()){
                    textFieldFahrenheit.setText("Enter value");
                    textFieldFahrenheit.setForeground(Color.RED);
                }else {
                    output = (Double.parseDouble(input)*((double) 9 /5)) + 32;
                    textFieldFahrenheit.setText(output+"");
                    textFieldFahrenheit.setForeground(Color.BLACK);
                }
            }
        }
        catch (NumberFormatException er){
            textFieldFahrenheit.setText("Enter Correct value");
            textFieldFahrenheit.setForeground(Color.RED);
        }

    }
}
