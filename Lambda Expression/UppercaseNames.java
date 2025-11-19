import java.util.*;

public class UppercaseNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("alice", "bob", "charlie");

        List<String> upper = names.stream()
                                  .map(String::toUpperCase)
                                  .toList();

        System.out.println(upper);
    }
}
