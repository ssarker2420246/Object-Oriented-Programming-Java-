package Banking_system_mini_problem;

class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Savings withdrawal successful. Balance: " + balance);
        } else {
            System.out.println("Savings account must keep minimum balance of 1000.");
        }
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + 5000) {
            balance -= amount;
            System.out.println("Current withdrawal successful. Balance: " + balance);
        } else {
            System.out.println("Withdrawal limit exceeded.");
        }
    }
}

public class BankingSystemDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("S101", 5000);
        CurrentAccount current = new CurrentAccount("C101", 3000);

        savings.deposit(2000);
        savings.withdraw(5500);
        savings.checkBalance();

        System.out.println();

        current.deposit(1000);
        current.withdraw(7000);
        current.checkBalance();
    }
}