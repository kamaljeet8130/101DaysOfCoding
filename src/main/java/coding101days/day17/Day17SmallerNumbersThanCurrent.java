package coding101days.day17;

/**
 * Day 17 — How Many Numbers Are Smaller Than the Current Number
 * LeetCode #1365
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */
public class Day17SmallerNumbersThanCurrent {

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] ans = smallerNumbersThanCurrent(nums);

        for (int x : ans) System.out.print(x + " ");
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) count++;
            }
            result[i] = count;
        }

        return result;
    }
}
