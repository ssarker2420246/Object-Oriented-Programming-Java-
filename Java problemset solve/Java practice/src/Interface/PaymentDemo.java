package Interface;

interface Payment {
    void makePayment(double amount);
}

class BkashPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Bkash.");
    }
}

class NagadPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Nagad.");
    }
}

class CardPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Card.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new BkashPayment();
        Payment p2 = new NagadPayment();
        Payment p3 = new CardPayment();

        p1.makePayment(500);
        p2.makePayment(800);
        p3.makePayment(1200);
    }
}