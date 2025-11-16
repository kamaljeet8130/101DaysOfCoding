package coding101days.day08;

/**
 * Day 08 — Find Minimum in Rotated Sorted Array
 * LeetCode #153
 *
 * Uses modified binary search to find the minimum element
 * in a rotated sorted array without duplicates.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Day08FindMinimumInRotatedArray {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum element: " + findMin(nums));
    }

    /**
     * Finds the minimum element in a rotated sorted array.
     *
     * @param nums Rotated sorted array without duplicates
     * @return Minimum element
     */
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If left half is sorted
            if (nums[mid] >= nums[start]) {
                ans = Math.min(ans, nums[start]);
                start = mid + 1;
            }
            // Right half is sorted
            else {
                ans = Math.min(ans, nums[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }
}
