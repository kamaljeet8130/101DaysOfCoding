package coding101days.day57;

/**
 * Day 57 — Power of a Number using Recursion
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Day57PowerOfNumber {

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
