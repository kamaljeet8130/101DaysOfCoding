package coding101days.day61;

/**
 * Day 61 — Count Substrings using Recursion
 *
 * Pattern: Mathematical Recursion
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Day61CountSubstrings {

    public static void main(String[] args) {
        System.out.println(countSubstrings("abcd", 0));
    }

    public static int countSubstrings(String s, int index) {
        // Base case
        if (index == s.length()) {
            return 0;
        }

        return (s.length() - index) + countSubstrings(s, index + 1);
    }
}
