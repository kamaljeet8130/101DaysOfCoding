package coding101days.day01;
/**
 * Day 01 — Binary Search
 * LeetCode #704
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Day01 {

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = -1;

        int result = search(nums, target);
        System.out.println("Target found at index: " + result);
    }
    /**
     * Performs binary search on a sorted array.
     *
     * @param nums   Sorted integer array
     * @param target Value to search for
     * @return Index of target if found, otherwise -1
     */
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevent potential overflow

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] > target) {
                end = mid - 1; // Search in left half
            } else {
                start = mid + 1; // Search in right half
            }
        }
        return -1; // Target not found
    }
}
