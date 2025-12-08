package coding101days.day30;

import java.util.Arrays;
import java.util.List;

public class Day30StreamToUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("abc","java","coding","dsa");
        List<String> result = names.stream().map(String::toUpperCase)
                .toList();
        System.out.println(result);
    }
}
