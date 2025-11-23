package coding101days.day14;

/**
 * Day 14 — Capacity To Ship Packages Within D Days
 * LeetCode #1011
 *
 * Binary Search on Answer Space:
 * We search for the minimum ship capacity such that
 * all packages can be delivered within the given days.
 *
 * Time Complexity: O(n log sum(weights))
 * Space Complexity: O(1)
 */
public class Day14ShipWithinDays {

    public static void main(String[] args) {
        int[] weights = {1,2,3,1,1};
        int days = 4;

        System.out.println("Minimum ship capacity: " + shipWithinDays(weights, days));
    }

    /**
     * Performs binary search on possible ship capacities.
     */
    public static int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;

        // Determine initial search boundaries
        for (int w : weights) {
            low = Math.max(low, w);   // minimum possible capacity
            high += w;                // maximum possible capacity
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canShipInDays(weights, mid, days)) {
                ans = mid;            // mid capacity works, try smaller
                high = mid - 1;
            } else {
                low = mid + 1;        // mid is too small, increase capacity
            }
        }

        return ans;
    }

    /**
     * Checks whether we can ship all packages within 'days'
     * using ship capacity = capacity
     */
    private static boolean canShipInDays(int[] weights, int capacity, int days) {
        int currentLoad = 0;
        int requiredDays = 1;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += w;
        }

        return requiredDays <= days;
    }
}
