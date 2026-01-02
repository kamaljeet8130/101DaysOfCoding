package coding101days.day56;

/**
 * Day 56 — Count Occurrences of a Digit using Recursion
 *
 * Time Complexity: O(digits)
 * Space Complexity: O(digits) [recursive stack]
 */
public class Day56CountDigitOccurrence {

    public static void main(String[] args) {
        System.out.println(countOccurrence(122333, 3));
    }

    public static int countOccurrence(int n, int digit) {
        if (n == 0) {
            return 0;
        }

        int count = (n % 10 == digit) ? 1 : 0;
        return count + countOccurrence(n / 10, digit);
    }
}
