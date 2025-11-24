package coding101days.day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Day 17 — Find All Numbers Disappeared in an Array
 * LeetCode #448
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Day17FindDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
