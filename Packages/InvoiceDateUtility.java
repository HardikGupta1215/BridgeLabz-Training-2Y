import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class InvoiceDateUtility {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        String format1 = DateFormatter.formatDate(today, "dd/MM/yyyy");
        String format2 = DateFormatter.formatDate(today, "MMMM dd, yyyy");
        String format3 = DateFormatter.formatDate(today, "yyyy-MM-dd");

        System.out.println("Format 1: " + format1);
        System.out.println("Format 2: " + format2);
        System.out.println("Format 3: " + format3);
    }
}
