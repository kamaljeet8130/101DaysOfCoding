package coding101days.day45;

import java.util.HashMap;
import java.util.Map;

/**
 * Day 45 — Subarray Sum Equals K
 * LeetCode #560
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Day45SubarraySumEqualsK {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println(subarraySum(nums, k)); // Output: 2
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
