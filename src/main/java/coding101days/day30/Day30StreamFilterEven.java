package coding101days.day30;

import java.util.Arrays;
import java.util.List;

public class Day30StreamFilterEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,4,6,3,9,10);
        List<Integer> result = numbers.stream().filter(n->n%2==0)
                .toList();
        System.out.println(result);
    }
}
