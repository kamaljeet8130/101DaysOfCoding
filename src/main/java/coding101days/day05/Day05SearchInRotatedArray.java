package coding101days.day05;

/**
 * Day 05 — Search in Rotated Sorted Array
 * LeetCode #33
 *
 * Pattern: Binary Search — Identify sorted region & search accordingly
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Day05SearchInRotatedArray {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = search(nums, target);
        System.out.println("Target " + target + " found at index: " + result);
    }

    /**
     * Searches for a target in a rotated sorted array using binary search.
     * At every step, identifies whether the left or right half is sorted
     * and decides the direction accordingly.
     *
     * @param nums   Rotated sorted integer array
     * @param target Value to search for
     * @return Index of target if found, otherwise -1
     */
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Direct hit
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1; // Target lies in sorted left half
                } else {
                    start = mid + 1; // Move to right half
                }
            }
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // Target lies in sorted right half
                } else {
                    end = mid - 1; // Move to left half
                }
            }
        }

        return -1; // Not found
    }
}
