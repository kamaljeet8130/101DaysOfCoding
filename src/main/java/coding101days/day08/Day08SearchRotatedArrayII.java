package coding101days.day08;

/**
 * Day 08 — Search in Rotated Sorted Array II
 * LeetCode #81
 *
 * Handles searching in a rotated sorted array that may contain duplicates.
 * Requires careful boundary checks because duplicates reduce binary search efficiency.
 *
 * Time Complexity: O(log n) average, O(n) worst case
 * Space Complexity: O(1)
 */
public class Day08SearchRotatedArrayII {

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        System.out.println("Target found: " + search(nums, target));
    }

    /**
     * Searches for a target value in a rotated sorted array with duplicates.
     *
     * @param nums   Rotated sorted array (may contain duplicates)
     * @param target Value to search
     * @return True if target exists, false otherwise
     */
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return true;

            // Handle duplicate boundaries
            if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                start++;
                end--;
                continue;
            }

            // Right half is sorted
            if (nums[mid] <= nums[end]) {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // Left half is sorted
            else {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return false;
    }
}
