package coding101days.day10;

/**
 * Day 10 — Sqrt(x)
 * LeetCode #69
 * <p>
 * Uses binary search to compute the integer part of the square root.
 * If x is not a perfect square, returns the floor value.
 * <p>
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Day10SqrtX {

    public static void main(String[] args) {
        System.out.println("Square root: " + mySqrt(214748353));
    }

    /**
     * Computes sqrt(x) using binary search.
     *
     * @param x Non-negative integer
     * @return Floor value of sqrt(x)
     */
    public static int mySqrt(int x) {

        if (x < 2) return x;

        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {   // prevent overflow

                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end; // end will be the floor of sqrt(x)
    }
}
