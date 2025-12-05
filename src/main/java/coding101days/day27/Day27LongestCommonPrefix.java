package coding101days.day27;

/**
 * Day 27 — Longest Common Prefix
 * LeetCode #14
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 */
public class Day27LongestCommonPrefix {

    public static void main(String[] args) {
        String[] words = {"flowers", "flow", "fly", "flight"};
        System.out.println(longestCommonPrefix(words));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
