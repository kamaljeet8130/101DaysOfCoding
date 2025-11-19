package coding101days.day11;

/**
 * Day 11 — Koko Eating Bananas
 * LeetCode #875
 *
 * Binary Search on Answer Space.
 * We search for the minimum eating speed K such that
 * total hours required <= h.
 *
 * Time Complexity: O(n log maxPile)
 * Space Complexity: O(1)
 */
public class Day11KokoEatingBananas {

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        System.out.println("Minimum eating speed: " + minEatingSpeed(piles, h));
    }

    /**
     * Finds minimum eating speed using binary search.
     */
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalHours = totalHour(piles, mid);

            if (totalHours <= h) {
                high = mid - 1; // try smaller speed
            } else {
                low = mid + 1;  // need faster speed
            }
        }

        return low;
    }

    /**
     * Finds max value in array.
     */
    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            max = Math.max(max, value);
        }
        return max;
    }

    /**
     * Calculates total hours needed for a given eating speed K.
     */
    private static int totalHour(int[] piles, int k) {
        int total = 0;
        for (int pile : piles) {
            // Using integer math to avoid floating point
            total += (pile + k - 1) / k;
        }
        return total;
    }
}
