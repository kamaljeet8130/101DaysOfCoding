package coding101days.day18;

import java.util.Arrays;

/**
 * Day 18 — Can Make Arithmetic Progression From Sequence
 * LeetCode #1502
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1) or O(n) depending on sort implementation
 */
public class Day18ArithmeticProgression {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                return false;
            }
        }
        return true;
    }
}
