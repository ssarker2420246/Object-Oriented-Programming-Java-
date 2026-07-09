package BankAccExeption;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance. Available balance: " + balance);
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount account = new BankAccount("ACC12345", 5000.00);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = input.nextDouble();

            account.withdraw(amount);

        } catch (InsufficientFundsException e) {
            System.out.println("Bank Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid amount.");
        }

        input.close();
    }
}