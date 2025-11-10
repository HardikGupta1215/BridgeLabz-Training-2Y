class AccountNotFoundException extends Exception { AccountNotFoundException(String m){super(m);} }
class InsufficientFundsException3 extends Exception { InsufficientFundsException3(String m){super(m);} }
class Bank {
    void verifyAccount(boolean found) throws AccountNotFoundException {
        if (!found) throw new AccountNotFoundException("Account not found!");
    }
    void processTransaction(boolean funds) throws InsufficientFundsException3 {
        if (!funds) throw new InsufficientFundsException3("Not enough funds!");
    }
    void executeTransaction() throws Exception {
        verifyAccount(true);
        processTransaction(false);
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        try {
            b.executeTransaction();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
