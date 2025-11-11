package coding101days.day03;

/**
 * Day 03 — Find First and Last Position of Element in Sorted Array
 * LeetCode #34
 *
 * Pattern: Binary Search — Lower Bound & Upper Bound
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Day03SearchRange {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println("First and last position of " + target + " is: [" + result[0] + ", " + result[1] + "]");
    }

    /**
     * Finds the first and last position of a target element in a sorted array.
     * If the target is not found, returns [-1, -1].
     *
     * @param nums   Sorted integer array
     * @param target Value to search for
     * @return Array containing first and last positions of target
     */
    public static int[] searchRange(int[] nums, int target) {
        int first = search(nums, target, true);
        int last = search(nums, target, false);
        return new int[]{first, last};
    }

    /**
     * Helper function to find either the first or last occurrence of the target.
     *
     * @param nums   Sorted integer array
     * @param target Value to search for
     * @param isLeft true to find first occurrence, false to find last occurrence
     * @return Index of the target element based on search direction, or -1 if not found
     */
    public static int search(int[] nums, int target, boolean isLeft) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (isLeft) {
                    end = mid - 1; // look further left
                } else {
                    start = mid + 1; // look further right
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
