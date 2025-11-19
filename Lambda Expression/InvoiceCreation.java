import java.util.*;
import java.util.stream.*;

class Invoice {
    String txId;
    Invoice(String id) { txId = id; }

    public String toString() { return "Invoice{" + txId + "}"; }
}

public class InvoiceCreation {
    public static void main(String[] args) {

        List<String> txIds = Arrays.asList("TX01", "TX02", "TX03");

        List<Invoice> invoices =
                txIds.stream()
                     .map(Invoice::new)  // constructor reference
                     .toList();

        System.out.println(invoices);
    }
}
