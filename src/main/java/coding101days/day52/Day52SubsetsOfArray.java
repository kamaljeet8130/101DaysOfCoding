package coding101days.day52;

import java.util.ArrayList;
import java.util.List;

/**
 * Day 52 — Subsets of an Array
 * LeetCode #78
 *
 * Pattern: Recursion + Backtracking
 *
 * Time Complexity: O(2^n)
 * Space Complexity: O(n) (recursive stack + current list)
 */
public class Day52SubsetsOfArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    /**
     * Generates all subsets using recursion.
     *
     * @param nums    Input array
     * @param index   Current index
     * @param current Current subset being built
     * @param result  List to store all subsets
     */
    private static void generateSubsets(int[] nums,
                                        int index,
                                        List<Integer> current,
                                        List<List<Integer>> result) {

        // Base case: all elements processed
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Choice 1: include current element
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);

        // Backtrack: remove last added element
        current.remove(current.size() - 1);

        // Choice 2: exclude current element
        generateSubsets(nums, index + 1, current, result);
    }
}
