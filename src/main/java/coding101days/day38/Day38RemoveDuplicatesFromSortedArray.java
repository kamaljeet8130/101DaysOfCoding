package coding101days.day38;

import java.util.TreeSet;

/**
 * Day 38 — Remove Duplicates from Sorted Array
 * LeetCode #26
 *
 * Time Complexity:
 *  - Brute Force: O(n log n)
 *  - Optimal: O(n)
 *
 * Space Complexity:
 *  - Brute Force: O(n)
 *  - Optimal: O(1)
 */
public class Day38RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};

        System.out.println(removeDuplicatesOptimal(arr));
    }

    // Brute force using TreeSet
    public static int removeDuplicatesBruteForce(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int index = 0;
        for (int num : set) {
            arr[index++] = num;
        }

        return index;
    }

    // Optimal two-pointer approach
    public static int removeDuplicatesOptimal(int[] arr) {
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
        }
        return i + 1; // length of unique elements
    }
}
