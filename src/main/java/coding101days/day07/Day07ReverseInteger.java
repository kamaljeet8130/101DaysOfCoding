package coding101days.day07;

/**
 * Day 07 — Reverse Integer
 * LeetCode #7
 *
 * Problem: Reverse digits of a signed 32-bit integer.
 * Return 0 if the reversed integer overflows 32-bit range.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Day07ReverseInteger {

    public static void main(String[] args) {
        int n = 1534236469;
        System.out.println("Reversed: " + reverse(n));
    }

    /**
     * Reverses a 32-bit signed integer.
     * Uses long for intermediate calculations to detect overflow.
     *
     * @param x Input integer
     * @return Reversed integer or 0 if overflow occurs
     */
    public static int reverse(int x) {
        long reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Check 32-bit signed integer overflow
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reversed;
    }
}
