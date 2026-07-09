import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BankAccountApp implements ActionListener{

    private ArrayList<BankAcc> accounts = new ArrayList<>();
    JTextField searchField;
    JTextArea infoField;
    JTextField depositField;
    JTextField withdrawFiled;
    JButton search;
    JButton withdraw;
    JButton deposit;

    public static BankAcc currentAccount;
    public static boolean found = false;

    public static void main(String[] args) {

        BankAccountApp app = new BankAccountApp();

        try (BufferedReader reader = new BufferedReader(new FileReader("accounts.txt"))) {

            String L;
            while ((L = reader.readLine())!=null){

                L= L.trim();

                String[] info = L.split(",");
                try {
                    String name = info[0];
                    String accNumber = info[1];
                    double balance = Double.parseDouble(info[2]);
                    double amount = Double.parseDouble(info[3]);
                    String type = info[4];

                    app.accounts.add(new BankAcc(name,accNumber,balance,amount,type));


                }catch (NumberFormatException e){
                    System.out.println("Format Error-> " + e);
                }

            }
        }catch (FileNotFoundException e){
            System.out.println("File is missing!!");
        }catch (IOException e){
            System.out.println("Error-> " + e);
        }

        JFrame frame = new JFrame("Bank Account App");
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setSize(500,400);
        panel.setLayout(null);

        app.searchField = new JTextField();
        app.searchField.setBounds(100,50,200,30);
        app.searchField.setFont(new Font("Times New Roman",Font.BOLD,14));
        panel.add(app.searchField);

        app.infoField = new JTextArea();
        app.infoField.setBounds(100,100,200,120);
        app.infoField.setFont(new Font("Times New Roman",Font.PLAIN,14));
        app.infoField.setEditable(false);
        panel.add(app.infoField);

        app.depositField = new JTextField();
        app.depositField.setBounds(100,240,200,30);
        app.depositField.setFont(new Font("Times New Roman",Font.BOLD,14));
        panel.add(app.depositField);

        app.withdrawFiled = new JTextField();
        app.withdrawFiled.setBounds(100,290,200,30);
        app.withdrawFiled.setFont(new Font("Times New Roman",Font.BOLD,14));
        panel.add(app.withdrawFiled);

        app.search = new JButton("Search");
        app.search.setBounds(320,50,100,30);
        //app.search.setBackground(new Color(84, 136, 174, 116));
        app.search.setFocusable(false);
        app.search.addActionListener(app);
        panel.add(app.search);

        app.deposit = new JButton("Deposit");
        app.deposit.setBounds(320,240,100,30);
        //app.deposit.setBackground(new Color(84, 136, 174, 116));
        app.deposit.setFocusable(false);
        app.deposit.addActionListener(app);
        panel.add(app.deposit);

        app.withdraw = new JButton("Withdraw");
        app.withdraw.setBounds(320,290,100,30);
        //app.withdraw.setBackground(new Color(84, 136, 174, 116));
        app.withdraw.setFocusable(false);
        app.withdraw.addActionListener(app);
        panel.add(app.withdraw);

        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == search){

            found = false;

            for (BankAcc account : accounts){
                if (searchField.getText().isEmpty()){
                    infoField.setText("Enter Account Number!!");
                    infoField.setForeground(Color.RED);
                }
                else if (searchField.getText().equals(account.getNumber())){
                    depositField.setEditable(true);
                    withdrawFiled.setEditable(true);

                    currentAccount = account;
                    infoSet(account);
                    found = true;
                    break;
                }
                else if (!found){
                    infoField.setText("Invalid Account Number!!");
                    depositField.setEditable(false);
                    withdrawFiled.setEditable(false);
                    infoField.setForeground(Color.RED);
                }
            }
        }


        try{
            if (source == deposit && found){
                withdrawFiled.setText("");
                double amount = Double.parseDouble(depositField.getText());
                if (amount>0){
                    double newBalance = currentAccount.getBalance() + amount;

                    currentAccount.setBalance(newBalance);
                    currentAccount.setTransaction(amount);
                    currentAccount.setTransactionType("Deposit");

                    infoSet(currentAccount);
                }else {
                    infoSet(currentAccount);
                    infoField.append("\n\nInvalid Deposit Amount");
                }

            }else if(source == deposit && !found){
                infoField.setText("Enter Correct account number!!");
                withdrawFiled.setText("");
            }

            if (source == withdraw && found){
                depositField.setText("");
                double amount = Double.parseDouble(withdrawFiled.getText());
                if (amount>currentAccount.getBalance()) {
                    infoSet(currentAccount);
                    infoField.append("\n\nDon't have enough ");
                }else if (amount>0){
                    double newBalance = currentAccount.getBalance() - amount;

                    currentAccount.setBalance(newBalance);
                    currentAccount.setTransaction(amount);
                    currentAccount.setTransactionType("Withdraw");

                    infoSet(currentAccount);
                } else {
                    infoSet(currentAccount);
                    infoField.append("\n\nInvalid Withdraw Amount");
                }

            }else if(source == withdraw && !found) {
                infoField.setText("Enter Correct account number!!");
                depositField.setText("");
            }
        }catch (NumberFormatException er){
            infoSet(currentAccount);
            infoField.append("\n\nInvalid Amount");
        }
    }

    public void infoSet(BankAcc account){
        infoField.setText(
                "Name: " + account.getName() +
                        "\nBalance: " + account.getBalance() +
                        "\nLast Transaction: " + account.getTransaction()+
                        "\nLast Transaction Type: " + account.getTransactionType()
        );
        infoField.setForeground(Color.BLACK);
    }
}


