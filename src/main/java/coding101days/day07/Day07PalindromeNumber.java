package coding101days.day07;
/**
 * Day 07 — Palindrome Number
 * LeetCode #9
 *
 * Checks whether an integer is a palindrome without converting it to a string.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Day07PalindromeNumber {

    public static void main(String[] args) {
        int x = 121;
        System.out.println("Is Palindrome: " + isPalindrome(x));
    }
    /**
     * Determines whether the given number is a palindrome.
     * Negative numbers are not palindromes.
     *
     * @param x Input integer
     * @return true if x is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;  // negative numbers cannot be palindromes
        }
        long reversed = 0;
        int original = x;
        // Reverse the number
        while (original != 0) {
            reversed = reversed * 10 + (original % 10);
            original /= 10;
        }
        return reversed == x;
    }
}
