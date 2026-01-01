package coding101days.day53;

import java.util.ArrayList;
import java.util.List;

/**
 * Day 53 — Generate Parentheses
 * LeetCode #22
 *
 * Pattern: Recursion + Backtracking with constraints
 *
 * Time Complexity: O(4^n / sqrt(n))
 * Space Complexity: O(n) (recursive stack)
 */
public class Day53GenerateParentheses {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result,
                                  StringBuilder current,
                                  int open,
                                  int close,
                                  int max) {

        // Base case
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }

        // Add '(' if possible
        if (open < max) {
            current.append('(');
            backtrack(result, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1); // backtrack
        }

        // Add ')' if valid
        if (close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}
