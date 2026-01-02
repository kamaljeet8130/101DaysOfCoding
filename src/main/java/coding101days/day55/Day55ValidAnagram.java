package coding101days.day55;

/**
 * Day 55 — Valid Anagram
 * LeetCode #242
 *
 * Pattern: Hashing / Frequency Count
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)  (since alphabet size is fixed to 26)
 */
public class Day55ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }

    /**
     * Checks whether two strings are anagrams of each other.
     *
     * @param s first string
     * @param t second string
     * @return true if t is an anagram of s, false otherwise
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
