interface Pay_ment {
    void pay(double amount);
}

class UPI implements Pay_ment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CreditCard implements Pay_ment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class Wallet implements Pay_ment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet");
    }
}

public class Payment {
    public static void main(String[] args) {
        Pay_ment p = new Wallet();
        p.pay(250);
    }
}
