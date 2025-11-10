package coding101days.day02;

/**
 * Day 02 — Search Insert Position
 * LeetCode #35
 *
 * Pattern: Binary Search with Modified Return
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Day02SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int result = searchInsert(nums, target);
        System.out.println("Insert position for target " + target + " is: " + result);
    }

    /**
     * Finds the index of target if present, or the position where it would be inserted.
     *
     * @param nums   Sorted integer array
     * @param target Value to search for or insert
     * @return Index of target or its correct insertion position
     */
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If mid element is greater or equal, search left half
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // start now points to the insert position
        return start;
    }
}
