interface PaymentProcessor {
    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed (default refund).");
    }
}

class CreditCardPayment implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class UPIPayment implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }

    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed via UPI.");
    }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor cc = new CreditCardPayment();
        cc.pay(1500);
        cc.refund(500);

        PaymentProcessor upi = new UPIPayment();
        upi.pay(2000);
        upi.refund(800);
    }
}
