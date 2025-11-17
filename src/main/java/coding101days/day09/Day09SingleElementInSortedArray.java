package coding101days.day09;

/**
 * Day 09 — Single Element in a Sorted Array
 * LeetCode #540
 *
 * Uses binary search with parity checking to find the single element
 * in a sorted array where every other element appears twice.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Day09SingleElementInSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
        System.out.println("Single element: " + singleNonDuplicate(arr));
    }

    /**
     * Finds the single non-duplicate element in a sorted array.
     *
     * @param nums Sorted integer array with exact pairs except one unique element
     * @return The unique element
     */
    public static int singleNonDuplicate(int[] nums) {

        // Edge cases
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];

        int start = 1;
        int end = nums.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Found the unique element
            if (nums[mid - 1] != nums[mid] && nums[mid + 1] != nums[mid]) {
                return nums[mid];
            }

            // Check parity of mid to decide direction
            boolean evenIndexCorrectPair =
                    (mid % 2 == 0 && nums[mid] == nums[mid + 1]);
            boolean oddIndexCorrectPair =
                    (mid % 2 == 1 && nums[mid] == nums[mid - 1]);

            if (evenIndexCorrectPair || oddIndexCorrectPair) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Should never reach here
    }
}
