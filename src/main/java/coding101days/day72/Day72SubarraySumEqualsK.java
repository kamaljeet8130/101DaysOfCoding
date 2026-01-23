package coding101days.day72;

import java.util.HashMap;
import java.util.Map;

/**
 * Day 72 — Subarray Sum Equals K
 * LeetCode #560
 *
 * Pattern: Prefix Sum + HashMap
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Day72SubarraySumEqualsK {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.out.println(subarraySum(nums, 2));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
