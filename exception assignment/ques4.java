import java.util.Random;
class OutOfStockException extends Exception { OutOfStockException(String m){super(m);} }
class PaymentFailedException extends Exception { PaymentFailedException(String m){super(m);} }
class Order {
    void placeOrder() throws OutOfStockException, PaymentFailedException {
        int x = new Random().nextInt(2);
        if (x == 0) throw new OutOfStockException("Product out of stock!");
        else throw new PaymentFailedException("Payment failed!");
    }
    public static void main(String[] args) {
        Order o = new Order();
        try {
            o.placeOrder();
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}

