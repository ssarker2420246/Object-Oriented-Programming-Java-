public class BankAcc {

    private String NAME;
    private String Num;
    private double Balance;
    private double Transaction;
    private String TransactionType;

    public BankAcc(String name, String number, double balance, double transaction, String transactionType) {
        this.NAME = name;
        this.Num = number;
        this.Balance = balance;
        this.Transaction = transaction;
        this.TransactionType = transactionType;
    }

    public String getName() {
        return NAME;
    }

    public void setName(String name) {
        this.NAME = name;
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String num) {
        this.Num = num;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public double getTransaction() {
        return Transaction;
    }

    public void setTransaction(double transaction) {
        this.Transaction = transaction;
    }

    public String getTransactionType() {
        return TransactionType;
    }

    public void setTransactionType(String transactionType) {
        this.TransactionType = transactionType;
    }

    public String getNumber() {
        return "";
    }
}
