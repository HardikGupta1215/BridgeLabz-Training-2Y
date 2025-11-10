class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) { super(msg); }
}
class ATM {
    int balance = 10000;
    void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance)
            throw new InsufficientFundsException("Insufficient balance!");
        balance -= amount;
        System.out.println("Withdraw successful. Remaining balance: " + balance);
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(15000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
