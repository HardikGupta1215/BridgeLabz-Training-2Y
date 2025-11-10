import java.util.Random;
class NegativeAmountException extends Exception { NegativeAmountException(String m){super(m);} }
class InsufficientFundsException2 extends Exception { InsufficientFundsException2(String m){super(m);} }
class NetworkFailureException extends Exception { NetworkFailureException(String m){super(m);} }
class Transaction {
    void perform() throws NegativeAmountException, InsufficientFundsException2, NetworkFailureException {
        int r = new Random().nextInt(3);
        if (r == 0) throw new NegativeAmountException("Amount cannot be negative!");
        if (r == 1) throw new InsufficientFundsException2("Insufficient balance!");
        throw new NetworkFailureException("Network error!");
    }
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.perform();
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException2 e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}

