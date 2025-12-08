package coding101days.day30;

import java.util.Arrays;
import java.util.List;

public class Day30StreamSort {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,1,7,3,2);
        List<Integer> sorted = nums.stream().sorted().toList();

        System.out.println(sorted);
    }
}
