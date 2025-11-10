import java.util.*;
class InvalidSeatException extends Exception { InvalidSeatException(String m){super(m);} }
class SeatAlreadyBookedException extends Exception { SeatAlreadyBookedException(String m){super(m);} }
class Movie {
    Map<Integer, Boolean> seats = new HashMap<>();
    Movie() { for (int i = 1; i <= 5; i++) seats.put(i, true); }
    void bookSeat(int num) throws Exception {
        if (!seats.containsKey(num)) throw new InvalidSeatException("Invalid seat number!");
        if (!seats.get(num)) throw new SeatAlreadyBookedException("Seat already booked!");
        seats.put(num, false);
        System.out.println("Seat booked: " + num);
    }
    public static void main(String[] args) {
        Movie m = new Movie();
        try {
            m.bookSeat(6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

