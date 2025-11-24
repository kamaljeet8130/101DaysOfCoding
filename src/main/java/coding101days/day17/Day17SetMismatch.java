package coding101days.day17;

import java.util.HashMap;

/**
 * Day 17 — Set Mismatch
 * LeetCode #645
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Day17SetMismatch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] ans = findErrorNums(nums);
        System.out.println("Duplicate: " + ans[0] + ", Missing: " + ans[1]);
    }

    public static int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int duplicate = -1;
        int missing = -1;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                missing = i;
            } else if (map.get(i) == 2) {
                duplicate = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}
