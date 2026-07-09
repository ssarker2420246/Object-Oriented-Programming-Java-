package Exception_with_oop;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
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

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Available balance: " + balance);
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining Balance: " + balance);
    }
}

public class BankExceptionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC101", 5000);

        try {
            account.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}