package coding101days.day19;

import java.util.ArrayList;
import java.util.List;

/**
 * Day 19 — Self Dividing Numbers
 * LeetCode #728
 *
 * Time Complexity: O(n * d)   (d = number of digits)
 * Space Complexity: O(n)
 */
public class Day19SelfDividingNumbers {

    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        while (left <= right) {
            if (isDivisible(left)) {
                list.add(left);
            }
            left++;
        }

        return list;
    }

    public static boolean isDivisible(int number) {
        int original = number;

        while (original != 0) {
            int digit = original % 10;

            if (digit == 0) return false;
            if (number % digit != 0) return false;

            original /= 10;
        }
        return true;
    }
}
