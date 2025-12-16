package coding101days.day38;

import java.util.Arrays;

/**
 * Day 38 — Find Missing Number
 * LeetCode #268
 *
 * Time Complexity:
 *  - Brute Force: O(n log n)
 *  - Optimal: O(n)
 *
 * Space Complexity:
 *  - Brute Force: O(1)
 *  - Optimal: O(1)
 */
public class Day38FindMissingNumber {

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 1, 4};

        System.out.println(missingNumberWithOptimalApproach(nums));
    }

    // Brute Force using sorting
    public static int missingNumberWithBruteForce(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    // Optimal approach using sum formula
    public static int missingNumberWithOptimalApproach(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
