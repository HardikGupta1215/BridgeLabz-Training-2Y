import java.util.*;
class BookNotAvailableException extends Exception { BookNotAvailableException(String m){super(m);} }
class InvalidReturnException extends Exception { InvalidReturnException(String m){super(m);} }
class UserLimitExceededException extends Exception { UserLimitExceededException(String m){super(m);} }
class Library {
    Map<String, Boolean> books = new HashMap<>();
    Map<String, Integer> userBooks = new HashMap<>();
    Library() { books.put("Java", true); books.put("DBMS", false); }
    void borrow(String user, String book) throws Exception {
        if (!books.getOrDefault(book, false)) throw new BookNotAvailableException("Book not available!");
        if (userBooks.getOrDefault(user, 0) >= 5) throw new UserLimitExceededException("Limit exceeded!");
        books.put(book, false);
        userBooks.put(user, userBooks.getOrDefault(user, 0) + 1);
        System.out.println("Book borrowed: " + book);
    }
    void returnBook(String user, String book) throws InvalidReturnException {
        if (books.getOrDefault(book, true)) throw new InvalidReturnException("Book not borrowed!");
        books.put(book, true);
        System.out.println("Book returned: " + book);
    }
    public static void main(String[] args) {
        Library l = new Library();
        try {
            l.borrow("Ayush", "DBMS");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

