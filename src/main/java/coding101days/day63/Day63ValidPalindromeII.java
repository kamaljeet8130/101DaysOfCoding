package coding101days.day63;

/**
 * Day 63 — Valid Palindrome II
 * LeetCode #680
 *
 * Pattern: Two Pointers + Greedy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Day63ValidPalindromeII {

    public static void main(String[] args) {
        System.out.println(validPalindrome("abca"));
    }

    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right)
                        || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
