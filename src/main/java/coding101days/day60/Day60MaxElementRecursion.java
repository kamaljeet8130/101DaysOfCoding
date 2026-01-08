package coding101days.day60;

/**
 * Day 60 — Maximum Element in Array using Recursion
 *
 * Pattern: Divide Problem Space
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Day60MaxElementRecursion {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2};
        System.out.println(findMax(arr, 0));
    }

    public static int findMax(int[] arr, int index) {
        // Base case
        if (index == arr.length - 1) {
            return arr[index];
        }

        int maxFromRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxFromRest);
    }
}
