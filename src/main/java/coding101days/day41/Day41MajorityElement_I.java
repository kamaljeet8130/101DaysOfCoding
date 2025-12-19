package coding101days.day41;

/**
 * Day 41 — Majority Element (Brute Force)
 * LeetCode #169
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class Day41MajorityElement_I {

    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int threshold = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > threshold) {
                return nums[i];
            }
        }
        return -1;
    }
}
