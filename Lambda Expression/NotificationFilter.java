import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Alert {
    String type;
    String message;

    Alert(String t, String m) { type = t; message = m; }

    public String toString() { return "[" + type + "] " + message; }
}

public class NotificationFilter {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("CRITICAL", "Heart rate dropping"),
            new Alert("INFO", "Vitals updated"),
            new Alert("MEDICATION", "Dose Reminder"),
            new Alert("CRITICAL", "Respiration issue")
        );

        Predicate<Alert> filter = a -> 
                a.type.equals("CRITICAL") || a.type.equals("MEDICATION");

        List<Alert> shown = alerts.stream()
                                  .filter(filter)
                                  .toList();

        System.out.println("Filtered Alerts → " + shown);
    }
}
