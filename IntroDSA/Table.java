public class Table {
    public static void main(String[] args) {
        int n = 5;
        int table[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
    }
}