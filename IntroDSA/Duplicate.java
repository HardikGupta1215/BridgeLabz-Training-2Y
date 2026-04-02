import java.util.*;

public class Duplicate {
    public static boolean hasDuplicate(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}