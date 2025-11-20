package coding101days.day12;

/**
 * Day 12 — Minimum Number of Days to Make m Bouquets
 * LeetCode #1482
 *
 * Binary Search on Answer Space.
 * We search for the minimum day such that we can form
 * at least m bouquets of size k.
 *
 * Time Complexity: O(n log maxDay)
 * Space Complexity: O(1)
 */
public class Day12MinimumDaysForBouquets {

    public static void main(String[] args) {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3, k = 1;

        System.out.println("Minimum days needed: " + minDays(bloomDay, m, k));
    }

    public static int minDays(int[] bloomDay, int m, int k) {

        // Impossible case
        if ((long) m * k > bloomDay.length) return -1;

        int start = findMin(bloomDay);
        int end = findMax(bloomDay);
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (canMakeBouquets(bloomDay, mid, m, k)) {
                ans = mid;
                end = mid - 1;  // Try earlier day
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            min = Math.min(min, value);
        }
        return min;
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            max = Math.max(max, value);
        }
        return max;
    }

    /**
     * Checks if we can make at least m bouquets by day = mid
     */
    private static boolean canMakeBouquets(int[] arr, int mid, int m, int k) {
        int flowers = 0;
        int bouquets = 0;

        for (int value : arr) {
            if (value <= mid) {
                flowers++;
            } else {
                flowers = 0; // reset sequence
            }

            if (flowers == k) {
                bouquets++;
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}
