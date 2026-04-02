import java.util.*;

public class Prerequisite {
    static boolean check(int completed[], int pre[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int c : completed) set.add(c);

        for (int p : pre) {
            if (!set.contains(p)) return false;
        }
        return true;
    }
}