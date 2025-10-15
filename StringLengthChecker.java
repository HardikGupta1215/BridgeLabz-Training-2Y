import java.util.Scanner;
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function<String, Integer> lengthChecker = str -> str.length();
        System.out.print("Enter a message: ");
        String message = sc.nextLine();
        int length = lengthChecker.apply(message);
        System.out.println("Message length: " + length);
        int limit = 50;
        if (length > limit) {
            System.out.println("Message exceeds the limit of " + limit + " characters!");
        } else {
            System.out.println("Message is within the limit.");
        }
    }
}
