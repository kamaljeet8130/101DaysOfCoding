package coding101days.day07;

/**
 * Day 07 — Armstrong Number
 *
 * An Armstrong number is a number that is equal to the sum of its digits
 * raised to the power of the number of digits.
 *
 * Example: 153 → 1³ + 5³ + 3³ = 153
 *
 * Time Complexity: O(d), where d = number of digits
 * Space Complexity: O(1)
 */
public class Day07ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println("Is Armstrong: " + isArmstrong(153));
    }

    /**
     * Counts digits in a number.
     */
    public static int countDigit(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    /**
     * Checks whether a number is an Armstrong number.
     *
     * @param number Input integer
     * @return true if Armstrong number, false otherwise
     */
    public static boolean isArmstrong(int number) {
        int original = number;
        int digits = countDigit(number);   // ✔ compute once!
        int armstrongNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            armstrongNumber += (int) Math.pow(digit, digits);
            number /= 10;
        }
        return original == armstrongNumber;
    }
}
