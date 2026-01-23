package coding101days.day67;

import java.util.HashSet;
import java.util.Set;

/**
 * Day 67 — Longest Consecutive Sequence
 * LeetCode #128
 *
 * Pattern: HashSet
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Day67LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
