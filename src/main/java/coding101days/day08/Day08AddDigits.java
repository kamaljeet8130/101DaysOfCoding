package coding101days.day08;

/**
 * Day 08 — Add Digits
 * LeetCode #258
 *
 * Repeatedly adds digits of a non-negative integer until
 * the result becomes a single digit.
 *
 * Example:
 * 4545 → 4+5+4+5 = 18 → 1+8 = 9
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(log n) due to recursion
 *
 * (A constant-time mathematical formula exists but recursion is perfectly valid.)
 */
public class Day08AddDigits {

    public static void main(String[] args) {
        int num = 4545;
        System.out.println("Final Digit: " + addDigits(num));
    }
    /**
     * Recursively adds digits until a single digit remains.
     *
     * @param num Input integer
     * @return Single-digit result after repeated digit sum
     */
    public static int addDigits(int num) {
        int sum = 0;

        // Sum all digits
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        // If single digit, return
        if (sum < 10) {
            return sum;
        }
        // Otherwise repeat for the new sum
        return addDigits(sum);
    }
}
