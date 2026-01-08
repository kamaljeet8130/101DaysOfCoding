package coding101days.day59;

/**
 * Day 59 — Palindrome Check using Recursion
 *
 * Pattern: Recursion + Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) [recursive stack]
 */
public class Day59PalindromeRecursion {

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam", 0, "madam".length() - 1));
    }

    public static boolean isPalindrome(String s, int left, int right) {
        // Base case
        if (left >= right) {
            return true;
        }

        // Mismatch case
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindrome(s, left + 1, right - 1);
    }
}
