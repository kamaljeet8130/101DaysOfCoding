package coding101days.day39;

import java.util.*;

/**
 * Day 39 — Union of Two Sorted Arrays
 *
 * Time Complexity:
 *  - Brute Force: O((n + m) log (n + m))
 *  - Optimal: O(n + m)
 *
 * Space Complexity:
 *  - Brute Force: O(n + m)
 *  - Optimal: O(n + m)
 */
public class Day39UnionOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        printArray(unionBruteForce(nums1, nums2));
        System.out.println();
        printArray(unionOptimal(nums1, nums2));
    }

    // Brute force approach using TreeSet
    public static int[] unionBruteForce(int[] nums1, int[] nums2) {
        Set<Integer> set = new TreeSet<>();

        for (int num : nums1) set.add(num);
        for (int num : nums2) set.add(num);

        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }

    // Optimal two-pointer approach
    public static int[] unionOptimal(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        int n = nums1.length, m = nums2.length;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                    list.add(nums2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                list.add(nums1[i]);
            }
            i++;
        }

        while (j < m) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                list.add(nums2[j]);
            }
            j++;
        }

        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
