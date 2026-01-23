package coding101days.day73;

/**
 * Day 73 — Check if Array is Sorted using Recursion
 *
 * Pattern: Recursive Validation
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Day73CheckArraySorted {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0));
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }
}
