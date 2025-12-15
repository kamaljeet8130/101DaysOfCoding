package coding101days.day36;

/**
 * Day 36 — Majority Element
 * LeetCode #169
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Day36MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums)); // Output: 2
    }

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
