package coding101days.day16;

/**
 * Day 16 — Concatenation of Array
 * LeetCode #1929
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Day16ConcatenateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] ans = getConcatenation(nums);

        for (int x : ans) System.out.print(x + " ");
    }

    public static int[] getConcatenation(int[] nums) {
        int size = nums.length * 2;
        int[] arr = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = nums[count];
            count++;
            if (count == nums.length) count = 0;
        }
        return arr;
    }
}
