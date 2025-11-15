package coding101days.day07;

/**
 * Day 07 — GCD / HCF of Two Numbers
 *
 * Finds the greatest common divisor (GCD) of two integers
 * using a simple iterative approach.
 *
 * Time Complexity: O(min(n1, n2))
 * Space Complexity: O(1)
 *
 * (Note: Euclid’s Algorithm is the optimal O(log n) solution,
 * shown below in comments for reference.)
 */
public class Day07GCDOfTwoNumbers {

    public static void main(String[] args) {
        System.out.println("GCD: " + findGcd(20, 15));
    }

    /**
     * Finds the GCD by checking all divisors up to the smaller number.
     *
     * @param number1 First integer
     * @param number2 Second integer
     * @return The greatest common divisor
     */
    public static int findGcd(int number1, int number2) {
        int min = Math.min(number1, number2);
        int gcd = 1;

        for (int i = 2; i <= min; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    /**
     * Optimal Approach (Euclid's Algorithm)
     *
     * public static int gcdEuclid(int a, int b) {
     *     while (b != 0) {
     *         int temp = b;
     *         b = a % b;
     *         a = temp;
     *     }
     *     return a;
     * }
     */
}
