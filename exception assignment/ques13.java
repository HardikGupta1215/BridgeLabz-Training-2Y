class SeatUnavailableException extends Exception { SeatUnavailableException(String m){super(m);} }
class PaymentFailedException2 extends Exception { PaymentFailedException2(String m){super(m);} }
class Flight {
    void checkSeatAvailability() throws SeatUnavailableException { throw new SeatUnavailableException("Seat unavailable!"); }
    void processPayment() throws PaymentFailedException2 { throw new PaymentFailedException2("Payment failed!"); }
    void bookTicket() throws Exception {
        checkSeatAvailability();
        processPayment();
    }
    public static void main(String[] args) {
        Flight f = new Flight();
        try {
            f.bookTicket();
        } catch (SeatUnavailableException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException2 e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown error!");
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}
