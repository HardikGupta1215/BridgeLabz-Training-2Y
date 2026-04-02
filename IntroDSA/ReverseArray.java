public class ReverseArray {
    public static int[] reverse(int arr[]) {
        int n = arr.length;
        int rev[] = new int[n];

        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }
        return rev;
    }
}