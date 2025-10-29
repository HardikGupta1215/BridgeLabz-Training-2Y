interface ReportExporter {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exported report to JSON format.");
    }
}

class CSVPDFExporter implements ReportExporter {
    public void exportToCSV() {
        System.out.println("Exported report to CSV format.");
    }

    public void exportToPDF() {
        System.out.println("Exported report to PDF format.");
    }
}

public class DataExportDemo {
    public static void main(String[] args) {
        ReportExporter exporter = new CSVPDFExporter();

        exporter.exportToCSV();
        exporter.exportToPDF();
        exporter.exportToJSON();
    }
}
