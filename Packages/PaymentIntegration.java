interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed.");
    }
}

class UPIProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CreditCardProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

public class PaymentIntegration {
    public static void main(String[] args) {
        PaymentProcessor upi = new UPIProcessor();
        PaymentProcessor cc = new CreditCardProcessor();

        upi.pay(500);
        cc.pay(1200);

        upi.refund(200);
        cc.refund(500);
    }
}
