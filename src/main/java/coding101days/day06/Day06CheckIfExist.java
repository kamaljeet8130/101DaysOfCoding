package coding101days.day06;

import java.util.Arrays;

/**
 * Day 06 — Check If N and Its Double Exist
 * LeetCode #1346
 *
 * Pattern: Sort + Binary Search Lookup
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */
public class Day06CheckIfExist {

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        boolean result = checkIfExist(arr);

        System.out.println("Exists (n, 2*n) pair: " + result);
    }

    /**
     * For each element n in the array, checks if 2*n also exists.
     * Uses sorting + binary search to achieve O(n log n) time.
     *
     * Skips index 'i' during search to avoid matching an element with itself.
     *
     * @param arr Input array
     * @return true if any pair (n, 2*n) exists, false otherwise
     */
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Skip the same index (cannot pair an element with itself)
                if (mid == i) {
                    if (arr[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                    continue;
                }

                if (arr[mid] == target) {
                    return true;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
