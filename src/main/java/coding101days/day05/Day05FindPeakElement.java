package coding101days.day05;

/**
 * Day 05 — Find Peak Element
 * LeetCode #162
 *
 * Pattern: Binary Search — Directional Slope Search
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Day05FindPeakElement {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};

        int result = findPeakElement(nums);
        System.out.println("Peak element found at index: " + result);
    }

    /**
     * Finds a peak element in the array using binary search.
     * A peak is any element greater than its neighbors.
     *
     * The idea:
     * - If nums[mid] < nums[mid + 1], you are on an upward slope → peak on right.
     * - Else, you are on a downward slope → peak on left (including mid).
     *
     * This guarantees convergence to ANY peak.
     *
     * @param nums Input array
     * @return Index of a peak element
     */
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Downward slope → peak is on left
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            }
            // Upward slope → peak is on right
            else {
                start = mid + 1;
            }
        }

        return start; // peak index
    }
}
