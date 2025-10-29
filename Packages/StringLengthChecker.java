import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        int limit = 50;
        Function<String, Integer> getLength = str -> str.length();

        String message = "This is a test message to check character limit.";

        int length = getLength.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds character limit!");
        } else {
            System.out.println("Message is within the limit.");
        }

        System.out.println("Message length: " + length);
    }
}
