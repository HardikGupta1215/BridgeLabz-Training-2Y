interface DataExporter {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON (default implementation).");
    }
}

class ReportCSV implements DataExporter {
    public void exportToCSV() {
        System.out.println("Exporting report to CSV format.");
    }

    public void exportToPDF() {
        System.out.println("Exporting report to PDF format.");
    }
}

class ReportAdvanced implements DataExporter {
    public void exportToCSV() {
        System.out.println("Exporting advanced report to CSV format.");
    }

    public void exportToPDF() {
        System.out.println("Exporting advanced report to PDF format.");
    }

    public void exportToJSON() {
        System.out.println("Exporting advanced report to JSON format.");
    }
}

public class DataExportFeature {
    public static void main(String[] args) {
        DataExporter basic = new ReportCSV();
        basic.exportToCSV();
        basic.exportToPDF();
        basic.exportToJSON();

        DataExporter advanced = new ReportAdvanced();
        advanced.exportToCSV();
        advanced.exportToPDF();
        advanced.exportToJSON();
    }
}
