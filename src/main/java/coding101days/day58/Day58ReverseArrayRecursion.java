package coding101days.day58;

/**
 * Day 58 — Reverse an Array using Recursion
 *
 * Pattern: Recursion + Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) [recursive stack]
 */
public class Day58ReverseArrayRecursion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, 0, arr.length - 1);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void reverse(int[] arr, int left, int right) {
        // Base case
        if (left >= right) {
            return;
        }

        // Swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recursive call
        reverse(arr, left + 1, right - 1);
    }
}
